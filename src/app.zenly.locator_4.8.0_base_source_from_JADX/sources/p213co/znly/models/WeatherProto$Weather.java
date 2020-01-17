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
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.WeatherProto$Weather */
public final class WeatherProto$Weather extends GeneratedMessageLite<WeatherProto$Weather, C6938a> implements WeatherProto$WeatherOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final WeatherProto$Weather f17088m = new WeatherProto$Weather();

    /* renamed from: n */
    private static volatile Parser<WeatherProto$Weather> f17089n;

    /* renamed from: e */
    private int f17090e;

    /* renamed from: f */
    private ProtobufList<C6939b> f17091f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private double f17092g;

    /* renamed from: h */
    private double f17093h;

    /* renamed from: i */
    private int f17094i;

    /* renamed from: j */
    private Timestamp f17095j;

    /* renamed from: k */
    private Timestamp f17096k;

    /* renamed from: l */
    private Timestamp f17097l;

    /* renamed from: co.znly.models.WeatherProto$Weather$ConditionOrBuilder */
    public interface ConditionOrBuilder extends MessageLiteOrBuilder {
        String getDescription();

        ByteString getDescriptionBytes();

        String getName();

        ByteString getNameBytes();

        C7408n3 getWeatherType();

        int getWeatherTypeValue();
    }

    /* renamed from: co.znly.models.WeatherProto$Weather$a */
    public static final class C6938a extends Builder<WeatherProto$Weather, C6938a> implements WeatherProto$WeatherOrBuilder {
        /* synthetic */ C6938a(C7386l3 l3Var) {
            this();
        }

        public C6939b getConditions(int i) {
            return ((WeatherProto$Weather) this.instance).getConditions(i);
        }

        public int getConditionsCount() {
            return ((WeatherProto$Weather) this.instance).getConditionsCount();
        }

        public List<C6939b> getConditionsList() {
            return Collections.unmodifiableList(((WeatherProto$Weather) this.instance).getConditionsList());
        }

        public int getHumidity() {
            return ((WeatherProto$Weather) this.instance).getHumidity();
        }

        public double getPressure() {
            return ((WeatherProto$Weather) this.instance).getPressure();
        }

        public Timestamp getSunrise() {
            return ((WeatherProto$Weather) this.instance).getSunrise();
        }

        public Timestamp getSunset() {
            return ((WeatherProto$Weather) this.instance).getSunset();
        }

        public double getTemperature() {
            return ((WeatherProto$Weather) this.instance).getTemperature();
        }

        public Timestamp getTimestamp() {
            return ((WeatherProto$Weather) this.instance).getTimestamp();
        }

        public boolean hasSunrise() {
            return ((WeatherProto$Weather) this.instance).hasSunrise();
        }

        public boolean hasSunset() {
            return ((WeatherProto$Weather) this.instance).hasSunset();
        }

        public boolean hasTimestamp() {
            return ((WeatherProto$Weather) this.instance).hasTimestamp();
        }

        private C6938a() {
            super(WeatherProto$Weather.f17088m);
        }
    }

    /* renamed from: co.znly.models.WeatherProto$Weather$b */
    public static final class C6939b extends GeneratedMessageLite<C6939b, C6940a> implements ConditionOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6939b f17098h = new C6939b();

        /* renamed from: i */
        private static volatile Parser<C6939b> f17099i;

        /* renamed from: e */
        private int f17100e;

        /* renamed from: f */
        private String f17101f;

        /* renamed from: g */
        private String f17102g;

        /* renamed from: co.znly.models.WeatherProto$Weather$b$a */
        public static final class C6940a extends Builder<C6939b, C6940a> implements ConditionOrBuilder {
            /* synthetic */ C6940a(C7386l3 l3Var) {
                this();
            }

            public String getDescription() {
                return ((C6939b) this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((C6939b) this.instance).getDescriptionBytes();
            }

            public String getName() {
                return ((C6939b) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((C6939b) this.instance).getNameBytes();
            }

            public C7408n3 getWeatherType() {
                return ((C6939b) this.instance).getWeatherType();
            }

            public int getWeatherTypeValue() {
                return ((C6939b) this.instance).getWeatherTypeValue();
            }

            private C6940a() {
                super(C6939b.f17098h);
            }
        }

        static {
            f17098h.makeImmutable();
        }

        private C6939b() {
            String str = "";
            this.f17101f = str;
            this.f17102g = str;
        }

        public static Parser<C6939b> parser() {
            return f17098h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7386l3.f18417a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6939b();
                case 2:
                    return f17098h;
                case 3:
                    return null;
                case 4:
                    return new C6940a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6939b bVar = (C6939b) obj2;
                    boolean z2 = this.f17100e != 0;
                    int i = this.f17100e;
                    if (bVar.f17100e != 0) {
                        z = true;
                    }
                    this.f17100e = visitor.visitInt(z2, i, z, bVar.f17100e);
                    this.f17101f = visitor.visitString(!this.f17101f.isEmpty(), this.f17101f, !bVar.f17101f.isEmpty(), bVar.f17101f);
                    this.f17102g = visitor.visitString(!this.f17102g.isEmpty(), this.f17102g, !bVar.f17102g.isEmpty(), bVar.f17102g);
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
                                    this.f17100e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    this.f17101f = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f17102g = codedInputStream.readStringRequireUtf8();
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
                    if (f17099i == null) {
                        synchronized (C6939b.class) {
                            if (f17099i == null) {
                                f17099i = new DefaultInstanceBasedParser(f17098h);
                            }
                        }
                    }
                    return f17099i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17098h;
        }

        public String getDescription() {
            return this.f17102g;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.f17102g);
        }

        public String getName() {
            return this.f17101f;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.f17101f);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17100e != C7408n3.WEATHER_TYPE_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17100e);
            }
            if (!this.f17101f.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getName());
            }
            if (!this.f17102g.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getDescription());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7408n3 getWeatherType() {
            C7408n3 a = C7408n3.m18081a(this.f17100e);
            return a == null ? C7408n3.UNRECOGNIZED : a;
        }

        public int getWeatherTypeValue() {
            return this.f17100e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17100e != C7408n3.WEATHER_TYPE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17100e);
            }
            if (!this.f17101f.isEmpty()) {
                codedOutputStream.writeString(2, getName());
            }
            if (!this.f17102g.isEmpty()) {
                codedOutputStream.writeString(3, getDescription());
            }
        }
    }

    static {
        f17088m.makeImmutable();
    }

    private WeatherProto$Weather() {
    }

    public static Parser<WeatherProto$Weather> parser() {
        return f17088m.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7386l3.f18417a[methodToInvoke.ordinal()]) {
            case 1:
                return new WeatherProto$Weather();
            case 2:
                return f17088m;
            case 3:
                this.f17091f.makeImmutable();
                return null;
            case 4:
                return new C6938a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                WeatherProto$Weather weatherProto$Weather = (WeatherProto$Weather) obj2;
                this.f17091f = visitor.visitList(this.f17091f, weatherProto$Weather.f17091f);
                this.f17092g = visitor.visitDouble(this.f17092g != 0.0d, this.f17092g, weatherProto$Weather.f17092g != 0.0d, weatherProto$Weather.f17092g);
                this.f17093h = visitor.visitDouble(this.f17093h != 0.0d, this.f17093h, weatherProto$Weather.f17093h != 0.0d, weatherProto$Weather.f17093h);
                boolean z2 = this.f17094i != 0;
                int i = this.f17094i;
                if (weatherProto$Weather.f17094i != 0) {
                    z = true;
                }
                this.f17094i = visitor.visitInt(z2, i, z, weatherProto$Weather.f17094i);
                this.f17095j = (Timestamp) visitor.visitMessage(this.f17095j, weatherProto$Weather.f17095j);
                this.f17096k = (Timestamp) visitor.visitMessage(this.f17096k, weatherProto$Weather.f17096k);
                this.f17097l = (Timestamp) visitor.visitMessage(this.f17097l, weatherProto$Weather.f17097l);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17090e |= weatherProto$Weather.f17090e;
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
                                if (!this.f17091f.isModifiable()) {
                                    this.f17091f = GeneratedMessageLite.mutableCopy(this.f17091f);
                                }
                                this.f17091f.add(codedInputStream.readMessage(C6939b.parser(), extensionRegistryLite));
                            } else if (readTag == 17) {
                                this.f17092g = codedInputStream.readDouble();
                            } else if (readTag == 25) {
                                this.f17093h = codedInputStream.readDouble();
                            } else if (readTag == 32) {
                                this.f17094i = codedInputStream.readInt32();
                            } else if (readTag == 42) {
                                Builder builder = this.f17095j != null ? (Timestamp.Builder) this.f17095j.toBuilder() : null;
                                this.f17095j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17095j);
                                    this.f17095j = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 50) {
                                Builder builder2 = this.f17096k != null ? (Timestamp.Builder) this.f17096k.toBuilder() : null;
                                this.f17096k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17096k);
                                    this.f17096k = (Timestamp) builder2.buildPartial();
                                }
                            } else if (readTag == 58) {
                                Builder builder3 = this.f17097l != null ? (Timestamp.Builder) this.f17097l.toBuilder() : null;
                                this.f17097l = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f17097l);
                                    this.f17097l = (Timestamp) builder3.buildPartial();
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
                if (f17089n == null) {
                    synchronized (WeatherProto$Weather.class) {
                        if (f17089n == null) {
                            f17089n = new DefaultInstanceBasedParser(f17088m);
                        }
                    }
                }
                return f17089n;
            default:
                throw new UnsupportedOperationException();
        }
        return f17088m;
    }

    public C6939b getConditions(int i) {
        return (C6939b) this.f17091f.get(i);
    }

    public int getConditionsCount() {
        return this.f17091f.size();
    }

    public List<C6939b> getConditionsList() {
        return this.f17091f;
    }

    public int getHumidity() {
        return this.f17094i;
    }

    public double getPressure() {
        return this.f17093h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17091f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17091f.get(i3));
        }
        double d = this.f17092g;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d);
        }
        double d2 = this.f17093h;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d2);
        }
        int i4 = this.f17094i;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i4);
        }
        if (this.f17095j != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getSunrise());
        }
        if (this.f17096k != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getSunset());
        }
        if (this.f17097l != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getTimestamp());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getSunrise() {
        Timestamp timestamp = this.f17095j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getSunset() {
        Timestamp timestamp = this.f17096k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public double getTemperature() {
        return this.f17092g;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.f17097l;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasSunrise() {
        return this.f17095j != null;
    }

    public boolean hasSunset() {
        return this.f17096k != null;
    }

    public boolean hasTimestamp() {
        return this.f17097l != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17091f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17091f.get(i));
        }
        double d = this.f17092g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        double d2 = this.f17093h;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(3, d2);
        }
        int i2 = this.f17094i;
        if (i2 != 0) {
            codedOutputStream.writeInt32(4, i2);
        }
        if (this.f17095j != null) {
            codedOutputStream.writeMessage(5, getSunrise());
        }
        if (this.f17096k != null) {
            codedOutputStream.writeMessage(6, getSunset());
        }
        if (this.f17097l != null) {
            codedOutputStream.writeMessage(7, getTimestamp());
        }
    }
}
