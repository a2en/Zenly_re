package p213co.znly.models.services.usermonitor;

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
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;

/* renamed from: co.znly.models.services.usermonitor.c */
public final class C8318c extends GeneratedMessageLite<C8318c, C8319a> implements UserMonitorProto$MonitoringInfoOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final C8318c f21032w = new C8318c();

    /* renamed from: x */
    private static volatile Parser<C8318c> f21033x;

    /* renamed from: e */
    private String f21034e;

    /* renamed from: f */
    private String f21035f;

    /* renamed from: g */
    private int f21036g;

    /* renamed from: h */
    private Timestamp f21037h;

    /* renamed from: i */
    private double f21038i;

    /* renamed from: j */
    private double f21039j;

    /* renamed from: k */
    private double f21040k;

    /* renamed from: l */
    private String f21041l;

    /* renamed from: m */
    private int f21042m;

    /* renamed from: n */
    private Timestamp f21043n;

    /* renamed from: o */
    private Timestamp f21044o;

    /* renamed from: p */
    private Timestamp f21045p;

    /* renamed from: q */
    private boolean f21046q;

    /* renamed from: r */
    private int f21047r;

    /* renamed from: s */
    private long f21048s;

    /* renamed from: t */
    private Timestamp f21049t;

    /* renamed from: u */
    private Timestamp f21050u;

    /* renamed from: v */
    private int f21051v;

    /* renamed from: co.znly.models.services.usermonitor.c$a */
    public static final class C8319a extends Builder<C8318c, C8319a> implements UserMonitorProto$MonitoringInfoOrBuilder {
        /* synthetic */ C8319a(C8315a aVar) {
            this();
        }

        public int getConfidenceLevelDepartureTime() {
            return ((C8318c) this.instance).getConfidenceLevelDepartureTime();
        }

        public String getCorrelationId() {
            return ((C8318c) this.instance).getCorrelationId();
        }

        public ByteString getCorrelationIdBytes() {
            return ((C8318c) this.instance).getCorrelationIdBytes();
        }

        public Timestamp getDepartureTime() {
            return ((C8318c) this.instance).getDepartureTime();
        }

        public C8316b getEventType() {
            return ((C8318c) this.instance).getEventType();
        }

        public int getEventTypeValue() {
            return ((C8318c) this.instance).getEventTypeValue();
        }

        public Timestamp getExpectedWakeup() {
            return ((C8318c) this.instance).getExpectedWakeup();
        }

        public Timestamp getExpireAt() {
            return ((C8318c) this.instance).getExpireAt();
        }

        public boolean getIsOffline() {
            return ((C8318c) this.instance).getIsOffline();
        }

        public double getLatitude() {
            return ((C8318c) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C8318c) this.instance).getLongitude();
        }

        public Timestamp getNoHeadingSince() {
            return ((C8318c) this.instance).getNoHeadingSince();
        }

        public Timestamp getOriginalEta() {
            return ((C8318c) this.instance).getOriginalEta();
        }

        public C6847b getPlaceOriginalDestination() {
            return ((C8318c) this.instance).getPlaceOriginalDestination();
        }

        public int getPlaceOriginalDestinationValue() {
            return ((C8318c) this.instance).getPlaceOriginalDestinationValue();
        }

        public long getPlaceOriginalId() {
            return ((C8318c) this.instance).getPlaceOriginalId();
        }

        public double getRadius() {
            return ((C8318c) this.instance).getRadius();
        }

        public C8320d getScheduleType() {
            return ((C8318c) this.instance).getScheduleType();
        }

        public int getScheduleTypeValue() {
            return ((C8318c) this.instance).getScheduleTypeValue();
        }

        public Timestamp getUpdatedEta() {
            return ((C8318c) this.instance).getUpdatedEta();
        }

        public String getUserUuid() {
            return ((C8318c) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C8318c) this.instance).getUserUuidBytes();
        }

        public String getWatchedUserUuid() {
            return ((C8318c) this.instance).getWatchedUserUuid();
        }

        public ByteString getWatchedUserUuidBytes() {
            return ((C8318c) this.instance).getWatchedUserUuidBytes();
        }

        public boolean hasDepartureTime() {
            return ((C8318c) this.instance).hasDepartureTime();
        }

        public boolean hasExpectedWakeup() {
            return ((C8318c) this.instance).hasExpectedWakeup();
        }

        public boolean hasExpireAt() {
            return ((C8318c) this.instance).hasExpireAt();
        }

        public boolean hasNoHeadingSince() {
            return ((C8318c) this.instance).hasNoHeadingSince();
        }

        public boolean hasOriginalEta() {
            return ((C8318c) this.instance).hasOriginalEta();
        }

        public boolean hasUpdatedEta() {
            return ((C8318c) this.instance).hasUpdatedEta();
        }

        private C8319a() {
            super(C8318c.f21032w);
        }
    }

    static {
        f21032w.makeImmutable();
    }

    private C8318c() {
        String str = "";
        this.f21034e = str;
        this.f21035f = str;
        this.f21041l = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8315a.f21023a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8318c();
            case 2:
                return f21032w;
            case 3:
                return null;
            case 4:
                return new C8319a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8318c cVar = (C8318c) obj2;
                this.f21034e = visitor.visitString(!this.f21034e.isEmpty(), this.f21034e, !cVar.f21034e.isEmpty(), cVar.f21034e);
                this.f21035f = visitor.visitString(!this.f21035f.isEmpty(), this.f21035f, !cVar.f21035f.isEmpty(), cVar.f21035f);
                this.f21036g = visitor.visitInt(this.f21036g != 0, this.f21036g, cVar.f21036g != 0, cVar.f21036g);
                this.f21037h = (Timestamp) visitor.visitMessage(this.f21037h, cVar.f21037h);
                this.f21038i = visitor.visitDouble(this.f21038i != 0.0d, this.f21038i, cVar.f21038i != 0.0d, cVar.f21038i);
                this.f21039j = visitor.visitDouble(this.f21039j != 0.0d, this.f21039j, cVar.f21039j != 0.0d, cVar.f21039j);
                this.f21040k = visitor.visitDouble(this.f21040k != 0.0d, this.f21040k, cVar.f21040k != 0.0d, cVar.f21040k);
                this.f21041l = visitor.visitString(!this.f21041l.isEmpty(), this.f21041l, !cVar.f21041l.isEmpty(), cVar.f21041l);
                this.f21042m = visitor.visitInt(this.f21042m != 0, this.f21042m, cVar.f21042m != 0, cVar.f21042m);
                this.f21043n = (Timestamp) visitor.visitMessage(this.f21043n, cVar.f21043n);
                this.f21044o = (Timestamp) visitor.visitMessage(this.f21044o, cVar.f21044o);
                this.f21045p = (Timestamp) visitor.visitMessage(this.f21045p, cVar.f21045p);
                boolean z2 = this.f21046q;
                boolean z3 = cVar.f21046q;
                this.f21046q = visitor.visitBoolean(z2, z2, z3, z3);
                this.f21047r = visitor.visitInt(this.f21047r != 0, this.f21047r, cVar.f21047r != 0, cVar.f21047r);
                this.f21048s = visitor.visitLong(this.f21048s != 0, this.f21048s, cVar.f21048s != 0, cVar.f21048s);
                this.f21049t = (Timestamp) visitor.visitMessage(this.f21049t, cVar.f21049t);
                this.f21050u = (Timestamp) visitor.visitMessage(this.f21050u, cVar.f21050u);
                boolean z4 = this.f21051v != 0;
                int i = this.f21051v;
                if (cVar.f21051v != 0) {
                    z = true;
                }
                this.f21051v = visitor.visitInt(z4, i, z, cVar.f21051v);
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
                                this.f21034e = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.f21035f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 24:
                                this.f21036g = codedInputStream.readEnum();
                                break;
                            case 34:
                                Builder builder = this.f21037h != null ? (Timestamp.Builder) this.f21037h.toBuilder() : null;
                                this.f21037h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f21037h);
                                    this.f21037h = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 41:
                                this.f21038i = codedInputStream.readDouble();
                                break;
                            case 49:
                                this.f21039j = codedInputStream.readDouble();
                                break;
                            case 57:
                                this.f21040k = codedInputStream.readDouble();
                                break;
                            case 66:
                                this.f21041l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 72:
                                this.f21042m = codedInputStream.readEnum();
                                break;
                            case 82:
                                Builder builder2 = this.f21043n != null ? (Timestamp.Builder) this.f21043n.toBuilder() : null;
                                this.f21043n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f21043n);
                                    this.f21043n = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 90:
                                Builder builder3 = this.f21044o != null ? (Timestamp.Builder) this.f21044o.toBuilder() : null;
                                this.f21044o = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f21044o);
                                    this.f21044o = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 98:
                                Builder builder4 = this.f21045p != null ? (Timestamp.Builder) this.f21045p.toBuilder() : null;
                                this.f21045p = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f21045p);
                                    this.f21045p = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 104:
                                this.f21046q = codedInputStream.readBool();
                                break;
                            case 112:
                                this.f21047r = codedInputStream.readEnum();
                                break;
                            case 120:
                                this.f21048s = codedInputStream.readInt64();
                                break;
                            case 130:
                                Builder builder5 = this.f21049t != null ? (Timestamp.Builder) this.f21049t.toBuilder() : null;
                                this.f21049t = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f21049t);
                                    this.f21049t = (Timestamp) builder5.buildPartial();
                                    break;
                                }
                            case 138:
                                Builder builder6 = this.f21050u != null ? (Timestamp.Builder) this.f21050u.toBuilder() : null;
                                this.f21050u = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder6 == null) {
                                    break;
                                } else {
                                    builder6.mergeFrom(this.f21050u);
                                    this.f21050u = (Timestamp) builder6.buildPartial();
                                    break;
                                }
                            case 144:
                                this.f21051v = codedInputStream.readInt32();
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
                if (f21033x == null) {
                    synchronized (C8318c.class) {
                        if (f21033x == null) {
                            f21033x = new DefaultInstanceBasedParser(f21032w);
                        }
                    }
                }
                return f21033x;
            default:
                throw new UnsupportedOperationException();
        }
        return f21032w;
    }

    public int getConfidenceLevelDepartureTime() {
        return this.f21051v;
    }

    public String getCorrelationId() {
        return this.f21041l;
    }

    public ByteString getCorrelationIdBytes() {
        return ByteString.copyFromUtf8(this.f21041l);
    }

    public Timestamp getDepartureTime() {
        Timestamp timestamp = this.f21050u;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C8316b getEventType() {
        C8316b a = C8316b.m19407a(this.f21036g);
        return a == null ? C8316b.UNRECOGNIZED : a;
    }

    public int getEventTypeValue() {
        return this.f21036g;
    }

    public Timestamp getExpectedWakeup() {
        Timestamp timestamp = this.f21049t;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getExpireAt() {
        Timestamp timestamp = this.f21037h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getIsOffline() {
        return this.f21046q;
    }

    public double getLatitude() {
        return this.f21038i;
    }

    public double getLongitude() {
        return this.f21039j;
    }

    public Timestamp getNoHeadingSince() {
        Timestamp timestamp = this.f21043n;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getOriginalEta() {
        Timestamp timestamp = this.f21044o;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6847b getPlaceOriginalDestination() {
        C6847b a = C6847b.m17595a(this.f21042m);
        return a == null ? C6847b.UNRECOGNIZED : a;
    }

    public int getPlaceOriginalDestinationValue() {
        return this.f21042m;
    }

    public long getPlaceOriginalId() {
        return this.f21048s;
    }

    public double getRadius() {
        return this.f21040k;
    }

    public C8320d getScheduleType() {
        C8320d a = C8320d.m19408a(this.f21047r);
        return a == null ? C8320d.UNRECOGNIZED : a;
    }

    public int getScheduleTypeValue() {
        return this.f21047r;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21034e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        if (!this.f21035f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getWatchedUserUuid());
        }
        if (this.f21036g != C8316b.Unknown.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f21036g);
        }
        if (this.f21037h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getExpireAt());
        }
        double d = this.f21038i;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(5, d);
        }
        double d2 = this.f21039j;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(6, d2);
        }
        double d3 = this.f21040k;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(7, d3);
        }
        if (!this.f21041l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(8, getCorrelationId());
        }
        if (this.f21042m != C6847b.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(9, this.f21042m);
        }
        if (this.f21043n != null) {
            i2 += CodedOutputStream.computeMessageSize(10, getNoHeadingSince());
        }
        if (this.f21044o != null) {
            i2 += CodedOutputStream.computeMessageSize(11, getOriginalEta());
        }
        if (this.f21045p != null) {
            i2 += CodedOutputStream.computeMessageSize(12, getUpdatedEta());
        }
        boolean z = this.f21046q;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(13, z);
        }
        if (this.f21047r != C8320d.NoSchedule.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(14, this.f21047r);
        }
        long j = this.f21048s;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(15, j);
        }
        if (this.f21049t != null) {
            i2 += CodedOutputStream.computeMessageSize(16, getExpectedWakeup());
        }
        if (this.f21050u != null) {
            i2 += CodedOutputStream.computeMessageSize(17, getDepartureTime());
        }
        int i3 = this.f21051v;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(18, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getUpdatedEta() {
        Timestamp timestamp = this.f21045p;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUserUuid() {
        return this.f21034e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f21034e);
    }

    public String getWatchedUserUuid() {
        return this.f21035f;
    }

    public ByteString getWatchedUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f21035f);
    }

    public boolean hasDepartureTime() {
        return this.f21050u != null;
    }

    public boolean hasExpectedWakeup() {
        return this.f21049t != null;
    }

    public boolean hasExpireAt() {
        return this.f21037h != null;
    }

    public boolean hasNoHeadingSince() {
        return this.f21043n != null;
    }

    public boolean hasOriginalEta() {
        return this.f21044o != null;
    }

    public boolean hasUpdatedEta() {
        return this.f21045p != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21034e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (!this.f21035f.isEmpty()) {
            codedOutputStream.writeString(2, getWatchedUserUuid());
        }
        if (this.f21036g != C8316b.Unknown.getNumber()) {
            codedOutputStream.writeEnum(3, this.f21036g);
        }
        if (this.f21037h != null) {
            codedOutputStream.writeMessage(4, getExpireAt());
        }
        double d = this.f21038i;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(5, d);
        }
        double d2 = this.f21039j;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(6, d2);
        }
        double d3 = this.f21040k;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(7, d3);
        }
        if (!this.f21041l.isEmpty()) {
            codedOutputStream.writeString(8, getCorrelationId());
        }
        if (this.f21042m != C6847b.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(9, this.f21042m);
        }
        if (this.f21043n != null) {
            codedOutputStream.writeMessage(10, getNoHeadingSince());
        }
        if (this.f21044o != null) {
            codedOutputStream.writeMessage(11, getOriginalEta());
        }
        if (this.f21045p != null) {
            codedOutputStream.writeMessage(12, getUpdatedEta());
        }
        boolean z = this.f21046q;
        if (z) {
            codedOutputStream.writeBool(13, z);
        }
        if (this.f21047r != C8320d.NoSchedule.getNumber()) {
            codedOutputStream.writeEnum(14, this.f21047r);
        }
        long j = this.f21048s;
        if (j != 0) {
            codedOutputStream.writeInt64(15, j);
        }
        if (this.f21049t != null) {
            codedOutputStream.writeMessage(16, getExpectedWakeup());
        }
        if (this.f21050u != null) {
            codedOutputStream.writeMessage(17, getDepartureTime());
        }
        int i = this.f21051v;
        if (i != 0) {
            codedOutputStream.writeInt32(18, i);
        }
    }
}
