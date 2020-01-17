package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place.C6844b;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;

/* renamed from: co.znly.models.VisitPointProto$VisitPoint */
public final class VisitPointProto$VisitPoint extends GeneratedMessageLite<VisitPointProto$VisitPoint, C6933a> implements VisitPointProto$VisitPointOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final VisitPointProto$VisitPoint f17062o = new VisitPointProto$VisitPoint();

    /* renamed from: p */
    private static volatile Parser<VisitPointProto$VisitPoint> f17063p;

    /* renamed from: e */
    private String f17064e = "";

    /* renamed from: f */
    private Timestamp f17065f;

    /* renamed from: g */
    private double f17066g;

    /* renamed from: h */
    private double f17067h;

    /* renamed from: i */
    private double f17068i;

    /* renamed from: j */
    private Timestamp f17069j;

    /* renamed from: k */
    private Timestamp f17070k;

    /* renamed from: l */
    private int f17071l;

    /* renamed from: m */
    private int f17072m;

    /* renamed from: n */
    private C6934b f17073n;

    /* renamed from: co.znly.models.VisitPointProto$VisitPoint$HeadingOrBuilder */
    public interface HeadingOrBuilder extends MessageLiteOrBuilder {
        Timestamp getDepartureTime();

        PlaceProto$Place getDestination();

        Timestamp getEta();

        PlaceProto$Place getOrigin();

        boolean hasDepartureTime();

        boolean hasDestination();

        boolean hasEta();

        boolean hasOrigin();
    }

    /* renamed from: co.znly.models.VisitPointProto$VisitPoint$a */
    public static final class C6933a extends Builder<VisitPointProto$VisitPoint, C6933a> implements VisitPointProto$VisitPointOrBuilder {
        /* synthetic */ C6933a(C7376k3 k3Var) {
            this();
        }

        public Timestamp getCreatedAt() {
            return ((VisitPointProto$VisitPoint) this.instance).getCreatedAt();
        }

        public C6934b getHeading() {
            return ((VisitPointProto$VisitPoint) this.instance).getHeading();
        }

        public double getHorizontalPrecision() {
            return ((VisitPointProto$VisitPoint) this.instance).getHorizontalPrecision();
        }

        public double getLatitude() {
            return ((VisitPointProto$VisitPoint) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((VisitPointProto$VisitPoint) this.instance).getLongitude();
        }

        public C6847b getPlaceTag() {
            return ((VisitPointProto$VisitPoint) this.instance).getPlaceTag();
        }

        public int getPlaceTagValue() {
            return ((VisitPointProto$VisitPoint) this.instance).getPlaceTagValue();
        }

        public C6936c getStatus() {
            return ((VisitPointProto$VisitPoint) this.instance).getStatus();
        }

        public int getStatusValue() {
            return ((VisitPointProto$VisitPoint) this.instance).getStatusValue();
        }

        public Timestamp getTimeIn() {
            return ((VisitPointProto$VisitPoint) this.instance).getTimeIn();
        }

        public Timestamp getTimeOut() {
            return ((VisitPointProto$VisitPoint) this.instance).getTimeOut();
        }

        public String getUserUuid() {
            return ((VisitPointProto$VisitPoint) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((VisitPointProto$VisitPoint) this.instance).getUserUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((VisitPointProto$VisitPoint) this.instance).hasCreatedAt();
        }

        public boolean hasHeading() {
            return ((VisitPointProto$VisitPoint) this.instance).hasHeading();
        }

        public boolean hasTimeIn() {
            return ((VisitPointProto$VisitPoint) this.instance).hasTimeIn();
        }

        public boolean hasTimeOut() {
            return ((VisitPointProto$VisitPoint) this.instance).hasTimeOut();
        }

        private C6933a() {
            super(VisitPointProto$VisitPoint.f17062o);
        }
    }

    /* renamed from: co.znly.models.VisitPointProto$VisitPoint$b */
    public static final class C6934b extends GeneratedMessageLite<C6934b, C6935a> implements HeadingOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6934b f17074i = new C6934b();

        /* renamed from: j */
        private static volatile Parser<C6934b> f17075j;

        /* renamed from: e */
        private PlaceProto$Place f17076e;

        /* renamed from: f */
        private PlaceProto$Place f17077f;

        /* renamed from: g */
        private Timestamp f17078g;

        /* renamed from: h */
        private Timestamp f17079h;

        /* renamed from: co.znly.models.VisitPointProto$VisitPoint$b$a */
        public static final class C6935a extends Builder<C6934b, C6935a> implements HeadingOrBuilder {
            /* synthetic */ C6935a(C7376k3 k3Var) {
                this();
            }

            public Timestamp getDepartureTime() {
                return ((C6934b) this.instance).getDepartureTime();
            }

            public PlaceProto$Place getDestination() {
                return ((C6934b) this.instance).getDestination();
            }

            public Timestamp getEta() {
                return ((C6934b) this.instance).getEta();
            }

            public PlaceProto$Place getOrigin() {
                return ((C6934b) this.instance).getOrigin();
            }

            public boolean hasDepartureTime() {
                return ((C6934b) this.instance).hasDepartureTime();
            }

            public boolean hasDestination() {
                return ((C6934b) this.instance).hasDestination();
            }

            public boolean hasEta() {
                return ((C6934b) this.instance).hasEta();
            }

            public boolean hasOrigin() {
                return ((C6934b) this.instance).hasOrigin();
            }

            private C6935a() {
                super(C6934b.f17074i);
            }
        }

        static {
            f17074i.makeImmutable();
        }

        private C6934b() {
        }

        public static C6934b getDefaultInstance() {
            return f17074i;
        }

        public static Parser<C6934b> parser() {
            return f17074i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7376k3.f18384a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6934b();
                case 2:
                    return f17074i;
                case 3:
                    return null;
                case 4:
                    return new C6935a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6934b bVar = (C6934b) obj2;
                    this.f17076e = (PlaceProto$Place) visitor.visitMessage(this.f17076e, bVar.f17076e);
                    this.f17077f = (PlaceProto$Place) visitor.visitMessage(this.f17077f, bVar.f17077f);
                    this.f17078g = (Timestamp) visitor.visitMessage(this.f17078g, bVar.f17078g);
                    this.f17079h = (Timestamp) visitor.visitMessage(this.f17079h, bVar.f17079h);
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
                                    Builder builder = this.f17076e != null ? (C6844b) this.f17076e.toBuilder() : null;
                                    this.f17076e = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17076e);
                                        this.f17076e = (PlaceProto$Place) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f17077f != null ? (C6844b) this.f17077f.toBuilder() : null;
                                    this.f17077f = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f17077f);
                                        this.f17077f = (PlaceProto$Place) builder2.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Builder builder3 = this.f17078g != null ? (Timestamp.Builder) this.f17078g.toBuilder() : null;
                                    this.f17078g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f17078g);
                                        this.f17078g = (Timestamp) builder3.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    Builder builder4 = this.f17079h != null ? (Timestamp.Builder) this.f17079h.toBuilder() : null;
                                    this.f17079h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder4 != null) {
                                        builder4.mergeFrom(this.f17079h);
                                        this.f17079h = (Timestamp) builder4.buildPartial();
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
                    if (f17075j == null) {
                        synchronized (C6934b.class) {
                            if (f17075j == null) {
                                f17075j = new DefaultInstanceBasedParser(f17074i);
                            }
                        }
                    }
                    return f17075j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17074i;
        }

        public Timestamp getDepartureTime() {
            Timestamp timestamp = this.f17079h;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public PlaceProto$Place getDestination() {
            PlaceProto$Place placeProto$Place = this.f17076e;
            return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
        }

        public Timestamp getEta() {
            Timestamp timestamp = this.f17078g;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public PlaceProto$Place getOrigin() {
            PlaceProto$Place placeProto$Place = this.f17077f;
            return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17076e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getDestination());
            }
            if (this.f17077f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getOrigin());
            }
            if (this.f17078g != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getEta());
            }
            if (this.f17079h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getDepartureTime());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasDepartureTime() {
            return this.f17079h != null;
        }

        public boolean hasDestination() {
            return this.f17076e != null;
        }

        public boolean hasEta() {
            return this.f17078g != null;
        }

        public boolean hasOrigin() {
            return this.f17077f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17076e != null) {
                codedOutputStream.writeMessage(1, getDestination());
            }
            if (this.f17077f != null) {
                codedOutputStream.writeMessage(2, getOrigin());
            }
            if (this.f17078g != null) {
                codedOutputStream.writeMessage(3, getEta());
            }
            if (this.f17079h != null) {
                codedOutputStream.writeMessage(4, getDepartureTime());
            }
        }
    }

    /* renamed from: co.znly.models.VisitPointProto$VisitPoint$c */
    public enum C6936c implements EnumLite {
        STATUS_UNDEFINED(0),
        STATUS_INACTIVE(1),
        STATUS_NEW(2),
        STATUS_EXISTING(3),
        STATUS_END(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17087e;

        /* renamed from: co.znly.models.VisitPointProto$VisitPoint$c$a */
        class C6937a implements EnumLiteMap<C6936c> {
            C6937a() {
            }

            public C6936c findValueByNumber(int i) {
                return C6936c.m17689a(i);
            }
        }

        static {
            new C6937a();
        }

        private C6936c(int i) {
            this.f17087e = i;
        }

        /* renamed from: a */
        public static C6936c m17689a(int i) {
            if (i == 0) {
                return STATUS_UNDEFINED;
            }
            if (i == 1) {
                return STATUS_INACTIVE;
            }
            if (i == 2) {
                return STATUS_NEW;
            }
            if (i == 3) {
                return STATUS_EXISTING;
            }
            if (i != 4) {
                return null;
            }
            return STATUS_END;
        }

        public final int getNumber() {
            return this.f17087e;
        }
    }

    static {
        f17062o.makeImmutable();
    }

    private VisitPointProto$VisitPoint() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7376k3.f18384a[methodToInvoke.ordinal()]) {
            case 1:
                return new VisitPointProto$VisitPoint();
            case 2:
                return f17062o;
            case 3:
                return null;
            case 4:
                return new C6933a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                VisitPointProto$VisitPoint visitPointProto$VisitPoint = (VisitPointProto$VisitPoint) obj2;
                this.f17064e = visitor.visitString(!this.f17064e.isEmpty(), this.f17064e, !visitPointProto$VisitPoint.f17064e.isEmpty(), visitPointProto$VisitPoint.f17064e);
                this.f17065f = (Timestamp) visitor.visitMessage(this.f17065f, visitPointProto$VisitPoint.f17065f);
                this.f17066g = visitor.visitDouble(this.f17066g != 0.0d, this.f17066g, visitPointProto$VisitPoint.f17066g != 0.0d, visitPointProto$VisitPoint.f17066g);
                this.f17067h = visitor.visitDouble(this.f17067h != 0.0d, this.f17067h, visitPointProto$VisitPoint.f17067h != 0.0d, visitPointProto$VisitPoint.f17067h);
                this.f17068i = visitor.visitDouble(this.f17068i != 0.0d, this.f17068i, visitPointProto$VisitPoint.f17068i != 0.0d, visitPointProto$VisitPoint.f17068i);
                this.f17069j = (Timestamp) visitor.visitMessage(this.f17069j, visitPointProto$VisitPoint.f17069j);
                this.f17070k = (Timestamp) visitor.visitMessage(this.f17070k, visitPointProto$VisitPoint.f17070k);
                this.f17071l = visitor.visitInt(this.f17071l != 0, this.f17071l, visitPointProto$VisitPoint.f17071l != 0, visitPointProto$VisitPoint.f17071l);
                boolean z2 = this.f17072m != 0;
                int i = this.f17072m;
                if (visitPointProto$VisitPoint.f17072m != 0) {
                    z = true;
                }
                this.f17072m = visitor.visitInt(z2, i, z, visitPointProto$VisitPoint.f17072m);
                this.f17073n = (C6934b) visitor.visitMessage(this.f17073n, visitPointProto$VisitPoint.f17073n);
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
                                this.f17066g = codedInputStream.readDouble();
                                break;
                            case 17:
                                this.f17067h = codedInputStream.readDouble();
                                break;
                            case 25:
                                this.f17068i = codedInputStream.readDouble();
                                break;
                            case 34:
                                Builder builder = this.f17069j != null ? (Timestamp.Builder) this.f17069j.toBuilder() : null;
                                this.f17069j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17069j);
                                    this.f17069j = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 42:
                                Builder builder2 = this.f17070k != null ? (Timestamp.Builder) this.f17070k.toBuilder() : null;
                                this.f17070k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f17070k);
                                    this.f17070k = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 56:
                                this.f17071l = codedInputStream.readEnum();
                                break;
                            case 98:
                                this.f17064e = codedInputStream.readStringRequireUtf8();
                                break;
                            case 112:
                                this.f17072m = codedInputStream.readEnum();
                                break;
                            case 122:
                                Builder builder3 = this.f17073n != null ? (C6935a) this.f17073n.toBuilder() : null;
                                this.f17073n = (C6934b) codedInputStream.readMessage(C6934b.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f17073n);
                                    this.f17073n = (C6934b) builder3.buildPartial();
                                    break;
                                }
                            case 130:
                                Builder builder4 = this.f17065f != null ? (Timestamp.Builder) this.f17065f.toBuilder() : null;
                                this.f17065f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f17065f);
                                    this.f17065f = (Timestamp) builder4.buildPartial();
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
                if (f17063p == null) {
                    synchronized (VisitPointProto$VisitPoint.class) {
                        if (f17063p == null) {
                            f17063p = new DefaultInstanceBasedParser(f17062o);
                        }
                    }
                }
                return f17063p;
            default:
                throw new UnsupportedOperationException();
        }
        return f17062o;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17065f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6934b getHeading() {
        C6934b bVar = this.f17073n;
        return bVar == null ? C6934b.getDefaultInstance() : bVar;
    }

    public double getHorizontalPrecision() {
        return this.f17068i;
    }

    public double getLatitude() {
        return this.f17066g;
    }

    public double getLongitude() {
        return this.f17067h;
    }

    public C6847b getPlaceTag() {
        C6847b a = C6847b.m17595a(this.f17072m);
        return a == null ? C6847b.UNRECOGNIZED : a;
    }

    public int getPlaceTagValue() {
        return this.f17072m;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f17066g;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        double d2 = this.f17067h;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d2);
        }
        double d3 = this.f17068i;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d3);
        }
        if (this.f17069j != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getTimeIn());
        }
        if (this.f17070k != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getTimeOut());
        }
        if (this.f17071l != C6936c.STATUS_UNDEFINED.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(7, this.f17071l);
        }
        if (!this.f17064e.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(12, getUserUuid());
        }
        if (this.f17072m != C6847b.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(14, this.f17072m);
        }
        if (this.f17073n != null) {
            i2 += CodedOutputStream.computeMessageSize(15, getHeading());
        }
        if (this.f17065f != null) {
            i2 += CodedOutputStream.computeMessageSize(16, getCreatedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6936c getStatus() {
        C6936c a = C6936c.m17689a(this.f17071l);
        return a == null ? C6936c.UNRECOGNIZED : a;
    }

    public int getStatusValue() {
        return this.f17071l;
    }

    public Timestamp getTimeIn() {
        Timestamp timestamp = this.f17069j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getTimeOut() {
        Timestamp timestamp = this.f17070k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUserUuid() {
        return this.f17064e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17064e);
    }

    public boolean hasCreatedAt() {
        return this.f17065f != null;
    }

    public boolean hasHeading() {
        return this.f17073n != null;
    }

    public boolean hasTimeIn() {
        return this.f17069j != null;
    }

    public boolean hasTimeOut() {
        return this.f17070k != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f17066g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
        double d2 = this.f17067h;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(2, d2);
        }
        double d3 = this.f17068i;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(3, d3);
        }
        if (this.f17069j != null) {
            codedOutputStream.writeMessage(4, getTimeIn());
        }
        if (this.f17070k != null) {
            codedOutputStream.writeMessage(5, getTimeOut());
        }
        if (this.f17071l != C6936c.STATUS_UNDEFINED.getNumber()) {
            codedOutputStream.writeEnum(7, this.f17071l);
        }
        if (!this.f17064e.isEmpty()) {
            codedOutputStream.writeString(12, getUserUuid());
        }
        if (this.f17072m != C6847b.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(14, this.f17072m);
        }
        if (this.f17073n != null) {
            codedOutputStream.writeMessage(15, getHeading());
        }
        if (this.f17065f != null) {
            codedOutputStream.writeMessage(16, getCreatedAt());
        }
    }
}
