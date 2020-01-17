package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7276d2;
import p213co.znly.models.C7320g1.C7322b;
import p213co.znly.models.C7408n3;
import p213co.znly.models.C7492v2;
import p213co.znly.models.PinContextProto$HeadingStripped.C6815b;
import p213co.znly.models.PinContextProto$HeadingStripped.C6815b.C6816a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.core.PinContextUIProto$PinContext */
public final class PinContextUIProto$PinContext extends GeneratedMessageLite<PinContextUIProto$PinContext, C6989a> implements PinContextUIProto$PinContextOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final PinContextUIProto$PinContext f17250y = new PinContextUIProto$PinContext();

    /* renamed from: z */
    private static volatile Parser<PinContextUIProto$PinContext> f17251z;

    /* renamed from: e */
    private String f17252e = "";

    /* renamed from: f */
    private Timestamp f17253f;

    /* renamed from: g */
    private double f17254g;

    /* renamed from: h */
    private double f17255h;

    /* renamed from: i */
    private int f17256i;

    /* renamed from: j */
    private int f17257j;

    /* renamed from: k */
    private boolean f17258k;

    /* renamed from: l */
    private boolean f17259l;

    /* renamed from: m */
    private boolean f17260m;

    /* renamed from: n */
    private int f17261n;

    /* renamed from: o */
    private C6992c f17262o;

    /* renamed from: p */
    private UserProto$User f17263p;

    /* renamed from: q */
    private boolean f17264q;

    /* renamed from: r */
    private boolean f17265r;

    /* renamed from: s */
    private boolean f17266s;

    /* renamed from: t */
    private C6996e f17267t;

    /* renamed from: u */
    private C6998f f17268u;

    /* renamed from: v */
    private C6990b f17269v;

    /* renamed from: w */
    private C7000g f17270w;

    /* renamed from: x */
    private C6994d f17271x;

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$ElevationOrBuilder */
    public interface ElevationOrBuilder extends MessageLiteOrBuilder {
        float getHeight();

        boolean getIsInSubway();
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$GPSOrBuilder */
    public interface GPSOrBuilder extends MessageLiteOrBuilder {
        Duration getDeltaDesynchro();

        float getHp();

        double getLat();

        double getLng();

        boolean hasDeltaDesynchro();
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$HeadingOrBuilder */
    public interface HeadingOrBuilder extends MessageLiteOrBuilder {
        Timestamp getDepartureTime();

        C6815b getDestination();

        Timestamp getEta();

        C6815b getOrigin();

        boolean hasDepartureTime();

        boolean hasDestination();

        boolean hasEta();

        boolean hasOrigin();
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$LocExtraOrBuilder */
    public interface LocExtraOrBuilder extends MessageLiteOrBuilder {
        C7322b getDynamic();

        int getDynamicValue();

        Timestamp getHereSince();

        float getHp();

        double getLat();

        double getLng();

        float getSpeed();

        boolean hasHereSince();
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$PersonalPlaceOrBuilder */
    public interface PersonalPlaceOrBuilder extends MessageLiteOrBuilder {
        C7276d2 getLabel();

        int getLabelValue();
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$WeatherOrBuilder */
    public interface WeatherOrBuilder extends MessageLiteOrBuilder {
        int getHumidity();

        float getPressure();

        float getTemperature();

        C7408n3 getType();

        int getTypeValue();
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$a */
    public static final class C6989a extends Builder<PinContextUIProto$PinContext, C6989a> implements PinContextUIProto$PinContextOrBuilder {
        /* synthetic */ C6989a(C7122i1 i1Var) {
            this();
        }

        public int getBatteryLevel() {
            return ((PinContextUIProto$PinContext) this.instance).getBatteryLevel();
        }

        public Timestamp getCreatedAt() {
            return ((PinContextUIProto$PinContext) this.instance).getCreatedAt();
        }

        public C6990b getElevation() {
            return ((PinContextUIProto$PinContext) this.instance).getElevation();
        }

        public C7492v2 getGhostType() {
            return ((PinContextUIProto$PinContext) this.instance).getGhostType();
        }

        public int getGhostTypeValue() {
            return ((PinContextUIProto$PinContext) this.instance).getGhostTypeValue();
        }

        public C6994d getHeading() {
            return ((PinContextUIProto$PinContext) this.instance).getHeading();
        }

        public int getHpRaw() {
            return ((PinContextUIProto$PinContext) this.instance).getHpRaw();
        }

        public boolean getIsCharging() {
            return ((PinContextUIProto$PinContext) this.instance).getIsCharging();
        }

        public boolean getIsDeleted() {
            return ((PinContextUIProto$PinContext) this.instance).getIsDeleted();
        }

        public boolean getIsInApp() {
            return ((PinContextUIProto$PinContext) this.instance).getIsInApp();
        }

        public boolean getIsLive() {
            return ((PinContextUIProto$PinContext) this.instance).getIsLive();
        }

        public boolean getIsMe() {
            return ((PinContextUIProto$PinContext) this.instance).getIsMe();
        }

        public boolean getIsWifiActive() {
            return ((PinContextUIProto$PinContext) this.instance).getIsWifiActive();
        }

        public double getLatRaw() {
            return ((PinContextUIProto$PinContext) this.instance).getLatRaw();
        }

        public double getLngRaw() {
            return ((PinContextUIProto$PinContext) this.instance).getLngRaw();
        }

        public C6996e getLocExtra() {
            return ((PinContextUIProto$PinContext) this.instance).getLocExtra();
        }

        public C6992c getMyGpsPosition() {
            return ((PinContextUIProto$PinContext) this.instance).getMyGpsPosition();
        }

        public C6998f getPersonalPlace() {
            return ((PinContextUIProto$PinContext) this.instance).getPersonalPlace();
        }

        public UserProto$User getUser() {
            return ((PinContextUIProto$PinContext) this.instance).getUser();
        }

        public String getUserUuid() {
            return ((PinContextUIProto$PinContext) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((PinContextUIProto$PinContext) this.instance).getUserUuidBytes();
        }

        public C7000g getWeather() {
            return ((PinContextUIProto$PinContext) this.instance).getWeather();
        }

        public boolean hasCreatedAt() {
            return ((PinContextUIProto$PinContext) this.instance).hasCreatedAt();
        }

        public boolean hasElevation() {
            return ((PinContextUIProto$PinContext) this.instance).hasElevation();
        }

        public boolean hasHeading() {
            return ((PinContextUIProto$PinContext) this.instance).hasHeading();
        }

        public boolean hasLocExtra() {
            return ((PinContextUIProto$PinContext) this.instance).hasLocExtra();
        }

        public boolean hasMyGpsPosition() {
            return ((PinContextUIProto$PinContext) this.instance).hasMyGpsPosition();
        }

        public boolean hasPersonalPlace() {
            return ((PinContextUIProto$PinContext) this.instance).hasPersonalPlace();
        }

        public boolean hasUser() {
            return ((PinContextUIProto$PinContext) this.instance).hasUser();
        }

        public boolean hasWeather() {
            return ((PinContextUIProto$PinContext) this.instance).hasWeather();
        }

        private C6989a() {
            super(PinContextUIProto$PinContext.f17250y);
        }
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$b */
    public static final class C6990b extends GeneratedMessageLite<C6990b, C6991a> implements ElevationOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6990b f17272g = new C6990b();

        /* renamed from: h */
        private static volatile Parser<C6990b> f17273h;

        /* renamed from: e */
        private float f17274e;

        /* renamed from: f */
        private boolean f17275f;

        /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$b$a */
        public static final class C6991a extends Builder<C6990b, C6991a> implements ElevationOrBuilder {
            /* synthetic */ C6991a(C7122i1 i1Var) {
                this();
            }

            public float getHeight() {
                return ((C6990b) this.instance).getHeight();
            }

            public boolean getIsInSubway() {
                return ((C6990b) this.instance).getIsInSubway();
            }

            private C6991a() {
                super(C6990b.f17272g);
            }
        }

        static {
            f17272g.makeImmutable();
        }

        private C6990b() {
        }

        public static C6990b getDefaultInstance() {
            return f17272g;
        }

        public static Parser<C6990b> parser() {
            return f17272g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6990b();
                case 2:
                    return f17272g;
                case 3:
                    return null;
                case 4:
                    return new C6991a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6990b bVar = (C6990b) obj2;
                    boolean z2 = this.f17274e != 0.0f;
                    float f = this.f17274e;
                    if (bVar.f17274e != 0.0f) {
                        z = true;
                    }
                    this.f17274e = visitor.visitFloat(z2, f, z, bVar.f17274e);
                    boolean z3 = this.f17275f;
                    boolean z4 = bVar.f17275f;
                    this.f17275f = visitor.visitBoolean(z3, z3, z4, z4);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 13) {
                                    this.f17274e = codedInputStream.readFloat();
                                } else if (readTag == 16) {
                                    this.f17275f = codedInputStream.readBool();
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
                    if (f17273h == null) {
                        synchronized (C6990b.class) {
                            if (f17273h == null) {
                                f17273h = new DefaultInstanceBasedParser(f17272g);
                            }
                        }
                    }
                    return f17273h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17272g;
        }

        public float getHeight() {
            return this.f17274e;
        }

        public boolean getIsInSubway() {
            return this.f17275f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            float f = this.f17274e;
            if (f != 0.0f) {
                i2 = 0 + CodedOutputStream.computeFloatSize(1, f);
            }
            boolean z = this.f17275f;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(2, z);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.f17274e;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(1, f);
            }
            boolean z = this.f17275f;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
        }
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$c */
    public static final class C6992c extends GeneratedMessageLite<C6992c, C6993a> implements GPSOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6992c f17276i = new C6992c();

        /* renamed from: j */
        private static volatile Parser<C6992c> f17277j;

        /* renamed from: e */
        private double f17278e;

        /* renamed from: f */
        private double f17279f;

        /* renamed from: g */
        private float f17280g;

        /* renamed from: h */
        private Duration f17281h;

        /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$c$a */
        public static final class C6993a extends Builder<C6992c, C6993a> implements GPSOrBuilder {
            /* synthetic */ C6993a(C7122i1 i1Var) {
                this();
            }

            public Duration getDeltaDesynchro() {
                return ((C6992c) this.instance).getDeltaDesynchro();
            }

            public float getHp() {
                return ((C6992c) this.instance).getHp();
            }

            public double getLat() {
                return ((C6992c) this.instance).getLat();
            }

            public double getLng() {
                return ((C6992c) this.instance).getLng();
            }

            public boolean hasDeltaDesynchro() {
                return ((C6992c) this.instance).hasDeltaDesynchro();
            }

            private C6993a() {
                super(C6992c.f17276i);
            }
        }

        static {
            f17276i.makeImmutable();
        }

        private C6992c() {
        }

        public static C6992c getDefaultInstance() {
            return f17276i;
        }

        public static Parser<C6992c> parser() {
            return f17276i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6992c();
                case 2:
                    return f17276i;
                case 3:
                    return null;
                case 4:
                    return new C6993a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6992c cVar = (C6992c) obj2;
                    this.f17278e = visitor.visitDouble(this.f17278e != 0.0d, this.f17278e, cVar.f17278e != 0.0d, cVar.f17278e);
                    this.f17279f = visitor.visitDouble(this.f17279f != 0.0d, this.f17279f, cVar.f17279f != 0.0d, cVar.f17279f);
                    boolean z2 = this.f17280g != 0.0f;
                    float f = this.f17280g;
                    if (cVar.f17280g != 0.0f) {
                        z = true;
                    }
                    this.f17280g = visitor.visitFloat(z2, f, z, cVar.f17280g);
                    this.f17281h = (Duration) visitor.visitMessage(this.f17281h, cVar.f17281h);
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
                                    this.f17278e = codedInputStream.readDouble();
                                } else if (readTag == 17) {
                                    this.f17279f = codedInputStream.readDouble();
                                } else if (readTag == 29) {
                                    this.f17280g = codedInputStream.readFloat();
                                } else if (readTag == 34) {
                                    Builder builder = this.f17281h != null ? (Duration.Builder) this.f17281h.toBuilder() : null;
                                    this.f17281h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17281h);
                                        this.f17281h = (Duration) builder.buildPartial();
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
                    if (f17277j == null) {
                        synchronized (C6992c.class) {
                            if (f17277j == null) {
                                f17277j = new DefaultInstanceBasedParser(f17276i);
                            }
                        }
                    }
                    return f17277j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17276i;
        }

        public Duration getDeltaDesynchro() {
            Duration duration = this.f17281h;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public float getHp() {
            return this.f17280g;
        }

        public double getLat() {
            return this.f17278e;
        }

        public double getLng() {
            return this.f17279f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            double d = this.f17278e;
            if (d != 0.0d) {
                i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
            }
            double d2 = this.f17279f;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d2);
            }
            float f = this.f17280g;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, f);
            }
            if (this.f17281h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getDeltaDesynchro());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasDeltaDesynchro() {
            return this.f17281h != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            double d = this.f17278e;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(1, d);
            }
            double d2 = this.f17279f;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(2, d2);
            }
            float f = this.f17280g;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(3, f);
            }
            if (this.f17281h != null) {
                codedOutputStream.writeMessage(4, getDeltaDesynchro());
            }
        }
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$d */
    public static final class C6994d extends GeneratedMessageLite<C6994d, C6995a> implements HeadingOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6994d f17282i = new C6994d();

        /* renamed from: j */
        private static volatile Parser<C6994d> f17283j;

        /* renamed from: e */
        private C6815b f17284e;

        /* renamed from: f */
        private C6815b f17285f;

        /* renamed from: g */
        private Timestamp f17286g;

        /* renamed from: h */
        private Timestamp f17287h;

        /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$d$a */
        public static final class C6995a extends Builder<C6994d, C6995a> implements HeadingOrBuilder {
            /* synthetic */ C6995a(C7122i1 i1Var) {
                this();
            }

            public Timestamp getDepartureTime() {
                return ((C6994d) this.instance).getDepartureTime();
            }

            public C6815b getDestination() {
                return ((C6994d) this.instance).getDestination();
            }

            public Timestamp getEta() {
                return ((C6994d) this.instance).getEta();
            }

            public C6815b getOrigin() {
                return ((C6994d) this.instance).getOrigin();
            }

            public boolean hasDepartureTime() {
                return ((C6994d) this.instance).hasDepartureTime();
            }

            public boolean hasDestination() {
                return ((C6994d) this.instance).hasDestination();
            }

            public boolean hasEta() {
                return ((C6994d) this.instance).hasEta();
            }

            public boolean hasOrigin() {
                return ((C6994d) this.instance).hasOrigin();
            }

            private C6995a() {
                super(C6994d.f17282i);
            }
        }

        static {
            f17282i.makeImmutable();
        }

        private C6994d() {
        }

        public static C6994d getDefaultInstance() {
            return f17282i;
        }

        public static C6995a newBuilder() {
            return (C6995a) f17282i.toBuilder();
        }

        public static Parser<C6994d> parser() {
            return f17282i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6994d();
                case 2:
                    return f17282i;
                case 3:
                    return null;
                case 4:
                    return new C6995a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6994d dVar = (C6994d) obj2;
                    this.f17284e = (C6815b) visitor.visitMessage(this.f17284e, dVar.f17284e);
                    this.f17285f = (C6815b) visitor.visitMessage(this.f17285f, dVar.f17285f);
                    this.f17286g = (Timestamp) visitor.visitMessage(this.f17286g, dVar.f17286g);
                    this.f17287h = (Timestamp) visitor.visitMessage(this.f17287h, dVar.f17287h);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Builder builder = this.f17284e != null ? (C6816a) this.f17284e.toBuilder() : null;
                                    this.f17284e = (C6815b) codedInputStream.readMessage(C6815b.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17284e);
                                        this.f17284e = (C6815b) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f17285f != null ? (C6816a) this.f17285f.toBuilder() : null;
                                    this.f17285f = (C6815b) codedInputStream.readMessage(C6815b.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f17285f);
                                        this.f17285f = (C6815b) builder2.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Builder builder3 = this.f17286g != null ? (Timestamp.Builder) this.f17286g.toBuilder() : null;
                                    this.f17286g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f17286g);
                                        this.f17286g = (Timestamp) builder3.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    Builder builder4 = this.f17287h != null ? (Timestamp.Builder) this.f17287h.toBuilder() : null;
                                    this.f17287h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder4 != null) {
                                        builder4.mergeFrom(this.f17287h);
                                        this.f17287h = (Timestamp) builder4.buildPartial();
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
                    if (f17283j == null) {
                        synchronized (C6994d.class) {
                            if (f17283j == null) {
                                f17283j = new DefaultInstanceBasedParser(f17282i);
                            }
                        }
                    }
                    return f17283j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17282i;
        }

        public Timestamp getDepartureTime() {
            Timestamp timestamp = this.f17287h;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public C6815b getDestination() {
            C6815b bVar = this.f17285f;
            return bVar == null ? C6815b.getDefaultInstance() : bVar;
        }

        public Timestamp getEta() {
            Timestamp timestamp = this.f17286g;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public C6815b getOrigin() {
            C6815b bVar = this.f17284e;
            return bVar == null ? C6815b.getDefaultInstance() : bVar;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17284e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getOrigin());
            }
            if (this.f17285f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getDestination());
            }
            if (this.f17286g != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getEta());
            }
            if (this.f17287h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getDepartureTime());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasDepartureTime() {
            return this.f17287h != null;
        }

        public boolean hasDestination() {
            return this.f17285f != null;
        }

        public boolean hasEta() {
            return this.f17286g != null;
        }

        public boolean hasOrigin() {
            return this.f17284e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17284e != null) {
                codedOutputStream.writeMessage(1, getOrigin());
            }
            if (this.f17285f != null) {
                codedOutputStream.writeMessage(2, getDestination());
            }
            if (this.f17286g != null) {
                codedOutputStream.writeMessage(3, getEta());
            }
            if (this.f17287h != null) {
                codedOutputStream.writeMessage(4, getDepartureTime());
            }
        }
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$e */
    public static final class C6996e extends GeneratedMessageLite<C6996e, C6997a> implements LocExtraOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static final C6996e f17288k = new C6996e();

        /* renamed from: l */
        private static volatile Parser<C6996e> f17289l;

        /* renamed from: e */
        private double f17290e;

        /* renamed from: f */
        private double f17291f;

        /* renamed from: g */
        private float f17292g;

        /* renamed from: h */
        private int f17293h;

        /* renamed from: i */
        private float f17294i;

        /* renamed from: j */
        private Timestamp f17295j;

        /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$e$a */
        public static final class C6997a extends Builder<C6996e, C6997a> implements LocExtraOrBuilder {
            /* synthetic */ C6997a(C7122i1 i1Var) {
                this();
            }

            public C7322b getDynamic() {
                return ((C6996e) this.instance).getDynamic();
            }

            public int getDynamicValue() {
                return ((C6996e) this.instance).getDynamicValue();
            }

            public Timestamp getHereSince() {
                return ((C6996e) this.instance).getHereSince();
            }

            public float getHp() {
                return ((C6996e) this.instance).getHp();
            }

            public double getLat() {
                return ((C6996e) this.instance).getLat();
            }

            public double getLng() {
                return ((C6996e) this.instance).getLng();
            }

            public float getSpeed() {
                return ((C6996e) this.instance).getSpeed();
            }

            public boolean hasHereSince() {
                return ((C6996e) this.instance).hasHereSince();
            }

            private C6997a() {
                super(C6996e.f17288k);
            }
        }

        static {
            f17288k.makeImmutable();
        }

        private C6996e() {
        }

        public static C6996e getDefaultInstance() {
            return f17288k;
        }

        public static Parser<C6996e> parser() {
            return f17288k.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6996e();
                case 2:
                    return f17288k;
                case 3:
                    return null;
                case 4:
                    return new C6997a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6996e eVar = (C6996e) obj2;
                    this.f17290e = visitor.visitDouble(this.f17290e != 0.0d, this.f17290e, eVar.f17290e != 0.0d, eVar.f17290e);
                    this.f17291f = visitor.visitDouble(this.f17291f != 0.0d, this.f17291f, eVar.f17291f != 0.0d, eVar.f17291f);
                    this.f17292g = visitor.visitFloat(this.f17292g != 0.0f, this.f17292g, eVar.f17292g != 0.0f, eVar.f17292g);
                    this.f17293h = visitor.visitInt(this.f17293h != 0, this.f17293h, eVar.f17293h != 0, eVar.f17293h);
                    boolean z2 = this.f17294i != 0.0f;
                    float f = this.f17294i;
                    if (eVar.f17294i != 0.0f) {
                        z = true;
                    }
                    this.f17294i = visitor.visitFloat(z2, f, z, eVar.f17294i);
                    this.f17295j = (Timestamp) visitor.visitMessage(this.f17295j, eVar.f17295j);
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
                                    this.f17290e = codedInputStream.readDouble();
                                } else if (readTag == 17) {
                                    this.f17291f = codedInputStream.readDouble();
                                } else if (readTag == 29) {
                                    this.f17292g = codedInputStream.readFloat();
                                } else if (readTag == 40) {
                                    this.f17293h = codedInputStream.readEnum();
                                } else if (readTag == 53) {
                                    this.f17294i = codedInputStream.readFloat();
                                } else if (readTag == 58) {
                                    Builder builder = this.f17295j != null ? (Timestamp.Builder) this.f17295j.toBuilder() : null;
                                    this.f17295j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17295j);
                                        this.f17295j = (Timestamp) builder.buildPartial();
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
                    if (f17289l == null) {
                        synchronized (C6996e.class) {
                            if (f17289l == null) {
                                f17289l = new DefaultInstanceBasedParser(f17288k);
                            }
                        }
                    }
                    return f17289l;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17288k;
        }

        public C7322b getDynamic() {
            C7322b a = C7322b.m18008a(this.f17293h);
            return a == null ? C7322b.UNRECOGNIZED : a;
        }

        public int getDynamicValue() {
            return this.f17293h;
        }

        public Timestamp getHereSince() {
            Timestamp timestamp = this.f17295j;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public float getHp() {
            return this.f17292g;
        }

        public double getLat() {
            return this.f17290e;
        }

        public double getLng() {
            return this.f17291f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            double d = this.f17290e;
            if (d != 0.0d) {
                i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
            }
            double d2 = this.f17291f;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d2);
            }
            float f = this.f17292g;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, f);
            }
            if (this.f17293h != C7322b.DYNAMIC_STATE_UNKNOWN.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(5, this.f17293h);
            }
            float f2 = this.f17294i;
            if (f2 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(6, f2);
            }
            if (this.f17295j != null) {
                i2 += CodedOutputStream.computeMessageSize(7, getHereSince());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public float getSpeed() {
            return this.f17294i;
        }

        public boolean hasHereSince() {
            return this.f17295j != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            double d = this.f17290e;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(1, d);
            }
            double d2 = this.f17291f;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(2, d2);
            }
            float f = this.f17292g;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(3, f);
            }
            if (this.f17293h != C7322b.DYNAMIC_STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(5, this.f17293h);
            }
            float f2 = this.f17294i;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(6, f2);
            }
            if (this.f17295j != null) {
                codedOutputStream.writeMessage(7, getHereSince());
            }
        }
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$f */
    public static final class C6998f extends GeneratedMessageLite<C6998f, C6999a> implements PersonalPlaceOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6998f f17296f = new C6998f();

        /* renamed from: g */
        private static volatile Parser<C6998f> f17297g;

        /* renamed from: e */
        private int f17298e;

        /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$f$a */
        public static final class C6999a extends Builder<C6998f, C6999a> implements PersonalPlaceOrBuilder {
            /* synthetic */ C6999a(C7122i1 i1Var) {
                this();
            }

            public C7276d2 getLabel() {
                return ((C6998f) this.instance).getLabel();
            }

            public int getLabelValue() {
                return ((C6998f) this.instance).getLabelValue();
            }

            private C6999a() {
                super(C6998f.f17296f);
            }
        }

        static {
            f17296f.makeImmutable();
        }

        private C6998f() {
        }

        public static C6998f getDefaultInstance() {
            return f17296f;
        }

        public static Parser<C6998f> parser() {
            return f17296f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6998f();
                case 2:
                    return f17296f;
                case 3:
                    return null;
                case 4:
                    return new C6999a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6998f fVar = (C6998f) obj2;
                    boolean z2 = this.f17298e != 0;
                    int i = this.f17298e;
                    if (fVar.f17298e != 0) {
                        z = true;
                    }
                    this.f17298e = visitor.visitInt(z2, i, z, fVar.f17298e);
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
                                    this.f17298e = codedInputStream.readEnum();
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
                    if (f17297g == null) {
                        synchronized (C6998f.class) {
                            if (f17297g == null) {
                                f17297g = new DefaultInstanceBasedParser(f17296f);
                            }
                        }
                    }
                    return f17297g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17296f;
        }

        public C7276d2 getLabel() {
            C7276d2 a = C7276d2.m17988a(this.f17298e);
            return a == null ? C7276d2.UNRECOGNIZED : a;
        }

        public int getLabelValue() {
            return this.f17298e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17298e != C7276d2.NOLABEL.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17298e);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17298e != C7276d2.NOLABEL.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17298e);
            }
        }
    }

    /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$g */
    public static final class C7000g extends GeneratedMessageLite<C7000g, C7001a> implements WeatherOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C7000g f17299i = new C7000g();

        /* renamed from: j */
        private static volatile Parser<C7000g> f17300j;

        /* renamed from: e */
        private int f17301e;

        /* renamed from: f */
        private float f17302f;

        /* renamed from: g */
        private float f17303g;

        /* renamed from: h */
        private int f17304h;

        /* renamed from: co.znly.models.core.PinContextUIProto$PinContext$g$a */
        public static final class C7001a extends Builder<C7000g, C7001a> implements WeatherOrBuilder {
            /* synthetic */ C7001a(C7122i1 i1Var) {
                this();
            }

            public int getHumidity() {
                return ((C7000g) this.instance).getHumidity();
            }

            public float getPressure() {
                return ((C7000g) this.instance).getPressure();
            }

            public float getTemperature() {
                return ((C7000g) this.instance).getTemperature();
            }

            public C7408n3 getType() {
                return ((C7000g) this.instance).getType();
            }

            public int getTypeValue() {
                return ((C7000g) this.instance).getTypeValue();
            }

            private C7001a() {
                super(C7000g.f17299i);
            }
        }

        static {
            f17299i.makeImmutable();
        }

        private C7000g() {
        }

        public static C7000g getDefaultInstance() {
            return f17299i;
        }

        public static Parser<C7000g> parser() {
            return f17299i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7000g();
                case 2:
                    return f17299i;
                case 3:
                    return null;
                case 4:
                    return new C7001a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7000g gVar = (C7000g) obj2;
                    this.f17301e = visitor.visitInt(this.f17301e != 0, this.f17301e, gVar.f17301e != 0, gVar.f17301e);
                    this.f17302f = visitor.visitFloat(this.f17302f != 0.0f, this.f17302f, gVar.f17302f != 0.0f, gVar.f17302f);
                    this.f17303g = visitor.visitFloat(this.f17303g != 0.0f, this.f17303g, gVar.f17303g != 0.0f, gVar.f17303g);
                    boolean z2 = this.f17304h != 0;
                    int i = this.f17304h;
                    if (gVar.f17304h != 0) {
                        z = true;
                    }
                    this.f17304h = visitor.visitInt(z2, i, z, gVar.f17304h);
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
                                    this.f17301e = codedInputStream.readEnum();
                                } else if (readTag == 21) {
                                    this.f17302f = codedInputStream.readFloat();
                                } else if (readTag == 29) {
                                    this.f17303g = codedInputStream.readFloat();
                                } else if (readTag == 32) {
                                    this.f17304h = codedInputStream.readInt32();
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
                    if (f17300j == null) {
                        synchronized (C7000g.class) {
                            if (f17300j == null) {
                                f17300j = new DefaultInstanceBasedParser(f17299i);
                            }
                        }
                    }
                    return f17300j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17299i;
        }

        public int getHumidity() {
            return this.f17304h;
        }

        public float getPressure() {
            return this.f17303g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17301e != C7408n3.WEATHER_TYPE_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17301e);
            }
            float f = this.f17302f;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(2, f);
            }
            float f2 = this.f17303g;
            if (f2 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, f2);
            }
            int i3 = this.f17304h;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(4, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public float getTemperature() {
            return this.f17302f;
        }

        public C7408n3 getType() {
            C7408n3 a = C7408n3.m18081a(this.f17301e);
            return a == null ? C7408n3.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.f17301e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17301e != C7408n3.WEATHER_TYPE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17301e);
            }
            float f = this.f17302f;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(2, f);
            }
            float f2 = this.f17303g;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(3, f2);
            }
            int i = this.f17304h;
            if (i != 0) {
                codedOutputStream.writeInt32(4, i);
            }
        }
    }

    static {
        f17250y.makeImmutable();
    }

    private PinContextUIProto$PinContext() {
    }

    public static Parser<PinContextUIProto$PinContext> parser() {
        return f17250y.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
            case 1:
                return new PinContextUIProto$PinContext();
            case 2:
                return f17250y;
            case 3:
                return null;
            case 4:
                return new C6989a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PinContextUIProto$PinContext pinContextUIProto$PinContext = (PinContextUIProto$PinContext) obj2;
                this.f17252e = visitor.visitString(!this.f17252e.isEmpty(), this.f17252e, !pinContextUIProto$PinContext.f17252e.isEmpty(), pinContextUIProto$PinContext.f17252e);
                this.f17253f = (Timestamp) visitor.visitMessage(this.f17253f, pinContextUIProto$PinContext.f17253f);
                this.f17254g = visitor.visitDouble(this.f17254g != 0.0d, this.f17254g, pinContextUIProto$PinContext.f17254g != 0.0d, pinContextUIProto$PinContext.f17254g);
                this.f17255h = visitor.visitDouble(this.f17255h != 0.0d, this.f17255h, pinContextUIProto$PinContext.f17255h != 0.0d, pinContextUIProto$PinContext.f17255h);
                this.f17256i = visitor.visitInt(this.f17256i != 0, this.f17256i, pinContextUIProto$PinContext.f17256i != 0, pinContextUIProto$PinContext.f17256i);
                this.f17257j = visitor.visitInt(this.f17257j != 0, this.f17257j, pinContextUIProto$PinContext.f17257j != 0, pinContextUIProto$PinContext.f17257j);
                boolean z2 = this.f17258k;
                boolean z3 = pinContextUIProto$PinContext.f17258k;
                this.f17258k = visitor.visitBoolean(z2, z2, z3, z3);
                boolean z4 = this.f17259l;
                boolean z5 = pinContextUIProto$PinContext.f17259l;
                this.f17259l = visitor.visitBoolean(z4, z4, z5, z5);
                boolean z6 = this.f17260m;
                boolean z7 = pinContextUIProto$PinContext.f17260m;
                this.f17260m = visitor.visitBoolean(z6, z6, z7, z7);
                boolean z8 = this.f17261n != 0;
                int i = this.f17261n;
                if (pinContextUIProto$PinContext.f17261n != 0) {
                    z = true;
                }
                this.f17261n = visitor.visitInt(z8, i, z, pinContextUIProto$PinContext.f17261n);
                this.f17262o = (C6992c) visitor.visitMessage(this.f17262o, pinContextUIProto$PinContext.f17262o);
                this.f17263p = (UserProto$User) visitor.visitMessage(this.f17263p, pinContextUIProto$PinContext.f17263p);
                boolean z9 = this.f17264q;
                boolean z10 = pinContextUIProto$PinContext.f17264q;
                this.f17264q = visitor.visitBoolean(z9, z9, z10, z10);
                boolean z11 = this.f17265r;
                boolean z12 = pinContextUIProto$PinContext.f17265r;
                this.f17265r = visitor.visitBoolean(z11, z11, z12, z12);
                boolean z13 = this.f17266s;
                boolean z14 = pinContextUIProto$PinContext.f17266s;
                this.f17266s = visitor.visitBoolean(z13, z13, z14, z14);
                this.f17267t = (C6996e) visitor.visitMessage(this.f17267t, pinContextUIProto$PinContext.f17267t);
                this.f17268u = (C6998f) visitor.visitMessage(this.f17268u, pinContextUIProto$PinContext.f17268u);
                this.f17269v = (C6990b) visitor.visitMessage(this.f17269v, pinContextUIProto$PinContext.f17269v);
                this.f17270w = (C7000g) visitor.visitMessage(this.f17270w, pinContextUIProto$PinContext.f17270w);
                this.f17271x = (C6994d) visitor.visitMessage(this.f17271x, pinContextUIProto$PinContext.f17271x);
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
                                this.f17252e = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f17253f != null ? (Timestamp.Builder) this.f17253f.toBuilder() : null;
                                this.f17253f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17253f);
                                    this.f17253f = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 25:
                                this.f17254g = codedInputStream.readDouble();
                                break;
                            case 33:
                                this.f17255h = codedInputStream.readDouble();
                                break;
                            case 40:
                                this.f17256i = codedInputStream.readInt32();
                                break;
                            case 48:
                                this.f17257j = codedInputStream.readEnum();
                                break;
                            case 56:
                                this.f17258k = codedInputStream.readBool();
                                break;
                            case 64:
                                this.f17259l = codedInputStream.readBool();
                                break;
                            case 72:
                                this.f17260m = codedInputStream.readBool();
                                break;
                            case 80:
                                this.f17261n = codedInputStream.readInt32();
                                break;
                            case 90:
                                Builder builder2 = this.f17262o != null ? (C6993a) this.f17262o.toBuilder() : null;
                                this.f17262o = (C6992c) codedInputStream.readMessage(C6992c.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f17262o);
                                    this.f17262o = (C6992c) builder2.buildPartial();
                                    break;
                                }
                            case 98:
                                Builder builder3 = this.f17263p != null ? (C6925a) this.f17263p.toBuilder() : null;
                                this.f17263p = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f17263p);
                                    this.f17263p = (UserProto$User) builder3.buildPartial();
                                    break;
                                }
                            case 104:
                                this.f17264q = codedInputStream.readBool();
                                break;
                            case 112:
                                this.f17265r = codedInputStream.readBool();
                                break;
                            case 120:
                                this.f17266s = codedInputStream.readBool();
                                break;
                            case 802:
                                Builder builder4 = this.f17267t != null ? (C6997a) this.f17267t.toBuilder() : null;
                                this.f17267t = (C6996e) codedInputStream.readMessage(C6996e.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f17267t);
                                    this.f17267t = (C6996e) builder4.buildPartial();
                                    break;
                                }
                            case 810:
                                Builder builder5 = this.f17268u != null ? (C6999a) this.f17268u.toBuilder() : null;
                                this.f17268u = (C6998f) codedInputStream.readMessage(C6998f.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f17268u);
                                    this.f17268u = (C6998f) builder5.buildPartial();
                                    break;
                                }
                            case 818:
                                Builder builder6 = this.f17269v != null ? (C6991a) this.f17269v.toBuilder() : null;
                                this.f17269v = (C6990b) codedInputStream.readMessage(C6990b.parser(), extensionRegistryLite);
                                if (builder6 == null) {
                                    break;
                                } else {
                                    builder6.mergeFrom(this.f17269v);
                                    this.f17269v = (C6990b) builder6.buildPartial();
                                    break;
                                }
                            case 826:
                                Builder builder7 = this.f17270w != null ? (C7001a) this.f17270w.toBuilder() : null;
                                this.f17270w = (C7000g) codedInputStream.readMessage(C7000g.parser(), extensionRegistryLite);
                                if (builder7 == null) {
                                    break;
                                } else {
                                    builder7.mergeFrom(this.f17270w);
                                    this.f17270w = (C7000g) builder7.buildPartial();
                                    break;
                                }
                            case 834:
                                Builder builder8 = this.f17271x != null ? (C6995a) this.f17271x.toBuilder() : null;
                                this.f17271x = (C6994d) codedInputStream.readMessage(C6994d.parser(), extensionRegistryLite);
                                if (builder8 == null) {
                                    break;
                                } else {
                                    builder8.mergeFrom(this.f17271x);
                                    this.f17271x = (C6994d) builder8.buildPartial();
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
                if (f17251z == null) {
                    synchronized (PinContextUIProto$PinContext.class) {
                        if (f17251z == null) {
                            f17251z = new DefaultInstanceBasedParser(f17250y);
                        }
                    }
                }
                return f17251z;
            default:
                throw new UnsupportedOperationException();
        }
        return f17250y;
    }

    public int getBatteryLevel() {
        return this.f17261n;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17253f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6990b getElevation() {
        C6990b bVar = this.f17269v;
        return bVar == null ? C6990b.getDefaultInstance() : bVar;
    }

    public C7492v2 getGhostType() {
        C7492v2 a = C7492v2.m18118a(this.f17257j);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getGhostTypeValue() {
        return this.f17257j;
    }

    public C6994d getHeading() {
        C6994d dVar = this.f17271x;
        return dVar == null ? C6994d.getDefaultInstance() : dVar;
    }

    public int getHpRaw() {
        return this.f17256i;
    }

    public boolean getIsCharging() {
        return this.f17260m;
    }

    public boolean getIsDeleted() {
        return this.f17264q;
    }

    public boolean getIsInApp() {
        return this.f17258k;
    }

    public boolean getIsLive() {
        return this.f17265r;
    }

    public boolean getIsMe() {
        return this.f17266s;
    }

    public boolean getIsWifiActive() {
        return this.f17259l;
    }

    public double getLatRaw() {
        return this.f17254g;
    }

    public double getLngRaw() {
        return this.f17255h;
    }

    public C6996e getLocExtra() {
        C6996e eVar = this.f17267t;
        return eVar == null ? C6996e.getDefaultInstance() : eVar;
    }

    public C6992c getMyGpsPosition() {
        C6992c cVar = this.f17262o;
        return cVar == null ? C6992c.getDefaultInstance() : cVar;
    }

    public C6998f getPersonalPlace() {
        C6998f fVar = this.f17268u;
        return fVar == null ? C6998f.getDefaultInstance() : fVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17252e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        if (this.f17253f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        double d = this.f17254g;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d);
        }
        double d2 = this.f17255h;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(4, d2);
        }
        int i3 = this.f17256i;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(5, i3);
        }
        if (this.f17257j != C7492v2.noghost.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(6, this.f17257j);
        }
        boolean z = this.f17258k;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(7, z);
        }
        boolean z2 = this.f17259l;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(8, z2);
        }
        boolean z3 = this.f17260m;
        if (z3) {
            i2 += CodedOutputStream.computeBoolSize(9, z3);
        }
        int i4 = this.f17261n;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(10, i4);
        }
        if (this.f17262o != null) {
            i2 += CodedOutputStream.computeMessageSize(11, getMyGpsPosition());
        }
        if (this.f17263p != null) {
            i2 += CodedOutputStream.computeMessageSize(12, getUser());
        }
        boolean z4 = this.f17264q;
        if (z4) {
            i2 += CodedOutputStream.computeBoolSize(13, z4);
        }
        boolean z5 = this.f17265r;
        if (z5) {
            i2 += CodedOutputStream.computeBoolSize(14, z5);
        }
        boolean z6 = this.f17266s;
        if (z6) {
            i2 += CodedOutputStream.computeBoolSize(15, z6);
        }
        if (this.f17267t != null) {
            i2 += CodedOutputStream.computeMessageSize(100, getLocExtra());
        }
        if (this.f17268u != null) {
            i2 += CodedOutputStream.computeMessageSize(101, getPersonalPlace());
        }
        if (this.f17269v != null) {
            i2 += CodedOutputStream.computeMessageSize(102, getElevation());
        }
        if (this.f17270w != null) {
            i2 += CodedOutputStream.computeMessageSize(103, getWeather());
        }
        if (this.f17271x != null) {
            i2 += CodedOutputStream.computeMessageSize(104, getHeading());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f17263p;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public String getUserUuid() {
        return this.f17252e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17252e);
    }

    public C7000g getWeather() {
        C7000g gVar = this.f17270w;
        return gVar == null ? C7000g.getDefaultInstance() : gVar;
    }

    public boolean hasCreatedAt() {
        return this.f17253f != null;
    }

    public boolean hasElevation() {
        return this.f17269v != null;
    }

    public boolean hasHeading() {
        return this.f17271x != null;
    }

    public boolean hasLocExtra() {
        return this.f17267t != null;
    }

    public boolean hasMyGpsPosition() {
        return this.f17262o != null;
    }

    public boolean hasPersonalPlace() {
        return this.f17268u != null;
    }

    public boolean hasUser() {
        return this.f17263p != null;
    }

    public boolean hasWeather() {
        return this.f17270w != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17252e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (this.f17253f != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        double d = this.f17254g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(3, d);
        }
        double d2 = this.f17255h;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(4, d2);
        }
        int i = this.f17256i;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        if (this.f17257j != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(6, this.f17257j);
        }
        boolean z = this.f17258k;
        if (z) {
            codedOutputStream.writeBool(7, z);
        }
        boolean z2 = this.f17259l;
        if (z2) {
            codedOutputStream.writeBool(8, z2);
        }
        boolean z3 = this.f17260m;
        if (z3) {
            codedOutputStream.writeBool(9, z3);
        }
        int i2 = this.f17261n;
        if (i2 != 0) {
            codedOutputStream.writeInt32(10, i2);
        }
        if (this.f17262o != null) {
            codedOutputStream.writeMessage(11, getMyGpsPosition());
        }
        if (this.f17263p != null) {
            codedOutputStream.writeMessage(12, getUser());
        }
        boolean z4 = this.f17264q;
        if (z4) {
            codedOutputStream.writeBool(13, z4);
        }
        boolean z5 = this.f17265r;
        if (z5) {
            codedOutputStream.writeBool(14, z5);
        }
        boolean z6 = this.f17266s;
        if (z6) {
            codedOutputStream.writeBool(15, z6);
        }
        if (this.f17267t != null) {
            codedOutputStream.writeMessage(100, getLocExtra());
        }
        if (this.f17268u != null) {
            codedOutputStream.writeMessage(101, getPersonalPlace());
        }
        if (this.f17269v != null) {
            codedOutputStream.writeMessage(102, getElevation());
        }
        if (this.f17270w != null) {
            codedOutputStream.writeMessage(103, getWeather());
        }
        if (this.f17271x != null) {
            codedOutputStream.writeMessage(104, getHeading());
        }
    }
}
