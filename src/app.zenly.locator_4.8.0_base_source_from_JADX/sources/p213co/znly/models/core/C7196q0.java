package p213co.znly.models.core;

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
import p213co.znly.models.services.usermonitor.C8316b;

/* renamed from: co.znly.models.core.q0 */
public final class C7196q0 extends GeneratedMessageLite<C7196q0, C7197a> implements CoreUserMonitorProto$UserMonitoringUpsertRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C7196q0 f17827n = new C7196q0();

    /* renamed from: o */
    private static volatile Parser<C7196q0> f17828o;

    /* renamed from: e */
    private String f17829e = "";

    /* renamed from: f */
    private int f17830f;

    /* renamed from: g */
    private double f17831g;

    /* renamed from: h */
    private double f17832h;

    /* renamed from: i */
    private double f17833i;

    /* renamed from: j */
    private int f17834j;

    /* renamed from: k */
    private Timestamp f17835k;

    /* renamed from: l */
    private long f17836l;

    /* renamed from: m */
    private Timestamp f17837m;

    /* renamed from: co.znly.models.core.q0$a */
    public static final class C7197a extends Builder<C7196q0, C7197a> implements CoreUserMonitorProto$UserMonitoringUpsertRequestOrBuilder {
        /* synthetic */ C7197a(C7158m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public C7197a mo19179a(String str) {
            copyOnWrite();
            ((C7196q0) this.instance).m17918a(str);
            return this;
        }

        /* renamed from: b */
        public C7197a mo19180b(Timestamp timestamp) {
            copyOnWrite();
            ((C7196q0) this.instance).m17919b(timestamp);
            return this;
        }

        public C8316b getEventType() {
            return ((C7196q0) this.instance).getEventType();
        }

        public int getEventTypeValue() {
            return ((C7196q0) this.instance).getEventTypeValue();
        }

        public Timestamp getExpectedWakeup() {
            return ((C7196q0) this.instance).getExpectedWakeup();
        }

        public double getLatitude() {
            return ((C7196q0) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C7196q0) this.instance).getLongitude();
        }

        public Timestamp getOriginalEta() {
            return ((C7196q0) this.instance).getOriginalEta();
        }

        public C6847b getPlaceOriginalDestination() {
            return ((C7196q0) this.instance).getPlaceOriginalDestination();
        }

        public int getPlaceOriginalDestinationValue() {
            return ((C7196q0) this.instance).getPlaceOriginalDestinationValue();
        }

        public long getPlaceOriginalId() {
            return ((C7196q0) this.instance).getPlaceOriginalId();
        }

        public double getRadius() {
            return ((C7196q0) this.instance).getRadius();
        }

        public String getWatchedUserUuid() {
            return ((C7196q0) this.instance).getWatchedUserUuid();
        }

        public ByteString getWatchedUserUuidBytes() {
            return ((C7196q0) this.instance).getWatchedUserUuidBytes();
        }

        public boolean hasExpectedWakeup() {
            return ((C7196q0) this.instance).hasExpectedWakeup();
        }

        public boolean hasOriginalEta() {
            return ((C7196q0) this.instance).hasOriginalEta();
        }

        public C7197a setLatitude(double d) {
            copyOnWrite();
            ((C7196q0) this.instance).setLatitude(d);
            return this;
        }

        public C7197a setLongitude(double d) {
            copyOnWrite();
            ((C7196q0) this.instance).setLongitude(d);
            return this;
        }

        private C7197a() {
            super(C7196q0.f17827n);
        }

        /* renamed from: a */
        public C7197a mo19178a(C8316b bVar) {
            copyOnWrite();
            ((C7196q0) this.instance).m17917a(bVar);
            return this;
        }

        /* renamed from: a */
        public C7197a mo19174a(double d) {
            copyOnWrite();
            ((C7196q0) this.instance).m17907a(d);
            return this;
        }

        /* renamed from: a */
        public C7197a mo19177a(C6847b bVar) {
            copyOnWrite();
            ((C7196q0) this.instance).m17910a(bVar);
            return this;
        }

        /* renamed from: a */
        public C7197a mo19175a(long j) {
            copyOnWrite();
            ((C7196q0) this.instance).m17908a(j);
            return this;
        }

        /* renamed from: a */
        public C7197a mo19176a(Timestamp timestamp) {
            copyOnWrite();
            ((C7196q0) this.instance).m17909a(timestamp);
            return this;
        }
    }

    static {
        f17827n.makeImmutable();
    }

    private C7196q0() {
    }

    public static C7197a newBuilder() {
        return (C7197a) f17827n.toBuilder();
    }

    /* access modifiers changed from: private */
    public void setLatitude(double d) {
        this.f17831g = d;
    }

    /* access modifiers changed from: private */
    public void setLongitude(double d) {
        this.f17832h = d;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7158m0.f17731a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7196q0();
            case 2:
                return f17827n;
            case 3:
                return null;
            case 4:
                return new C7197a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7196q0 q0Var = (C7196q0) obj2;
                this.f17829e = visitor.visitString(!this.f17829e.isEmpty(), this.f17829e, !q0Var.f17829e.isEmpty(), q0Var.f17829e);
                this.f17830f = visitor.visitInt(this.f17830f != 0, this.f17830f, q0Var.f17830f != 0, q0Var.f17830f);
                this.f17831g = visitor.visitDouble(this.f17831g != 0.0d, this.f17831g, q0Var.f17831g != 0.0d, q0Var.f17831g);
                this.f17832h = visitor.visitDouble(this.f17832h != 0.0d, this.f17832h, q0Var.f17832h != 0.0d, q0Var.f17832h);
                this.f17833i = visitor.visitDouble(this.f17833i != 0.0d, this.f17833i, q0Var.f17833i != 0.0d, q0Var.f17833i);
                this.f17834j = visitor.visitInt(this.f17834j != 0, this.f17834j, q0Var.f17834j != 0, q0Var.f17834j);
                this.f17835k = (Timestamp) visitor.visitMessage(this.f17835k, q0Var.f17835k);
                this.f17836l = visitor.visitLong(this.f17836l != 0, this.f17836l, q0Var.f17836l != 0, q0Var.f17836l);
                this.f17837m = (Timestamp) visitor.visitMessage(this.f17837m, q0Var.f17837m);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f17829e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f17830f = codedInputStream.readEnum();
                            } else if (readTag == 25) {
                                this.f17831g = codedInputStream.readDouble();
                            } else if (readTag == 33) {
                                this.f17832h = codedInputStream.readDouble();
                            } else if (readTag == 41) {
                                this.f17833i = codedInputStream.readDouble();
                            } else if (readTag == 48) {
                                this.f17834j = codedInputStream.readEnum();
                            } else if (readTag == 58) {
                                Builder builder = this.f17835k != null ? (Timestamp.Builder) this.f17835k.toBuilder() : null;
                                this.f17835k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17835k);
                                    this.f17835k = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 64) {
                                this.f17836l = codedInputStream.readInt64();
                            } else if (readTag == 74) {
                                Builder builder2 = this.f17837m != null ? (Timestamp.Builder) this.f17837m.toBuilder() : null;
                                this.f17837m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17837m);
                                    this.f17837m = (Timestamp) builder2.buildPartial();
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
                if (f17828o == null) {
                    synchronized (C7196q0.class) {
                        if (f17828o == null) {
                            f17828o = new DefaultInstanceBasedParser(f17827n);
                        }
                    }
                }
                return f17828o;
            default:
                throw new UnsupportedOperationException();
        }
        return f17827n;
    }

    public C8316b getEventType() {
        C8316b a = C8316b.m19407a(this.f17830f);
        return a == null ? C8316b.UNRECOGNIZED : a;
    }

    public int getEventTypeValue() {
        return this.f17830f;
    }

    public Timestamp getExpectedWakeup() {
        Timestamp timestamp = this.f17837m;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public double getLatitude() {
        return this.f17831g;
    }

    public double getLongitude() {
        return this.f17832h;
    }

    public Timestamp getOriginalEta() {
        Timestamp timestamp = this.f17835k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6847b getPlaceOriginalDestination() {
        C6847b a = C6847b.m17595a(this.f17834j);
        return a == null ? C6847b.UNRECOGNIZED : a;
    }

    public int getPlaceOriginalDestinationValue() {
        return this.f17834j;
    }

    public long getPlaceOriginalId() {
        return this.f17836l;
    }

    public double getRadius() {
        return this.f17833i;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17829e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getWatchedUserUuid());
        }
        if (this.f17830f != C8316b.Unknown.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f17830f);
        }
        double d = this.f17831g;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d);
        }
        double d2 = this.f17832h;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(4, d2);
        }
        double d3 = this.f17833i;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(5, d3);
        }
        if (this.f17834j != C6847b.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(6, this.f17834j);
        }
        if (this.f17835k != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getOriginalEta());
        }
        long j = this.f17836l;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(8, j);
        }
        if (this.f17837m != null) {
            i2 += CodedOutputStream.computeMessageSize(9, getExpectedWakeup());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getWatchedUserUuid() {
        return this.f17829e;
    }

    public ByteString getWatchedUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17829e);
    }

    public boolean hasExpectedWakeup() {
        return this.f17837m != null;
    }

    public boolean hasOriginalEta() {
        return this.f17835k != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17829e.isEmpty()) {
            codedOutputStream.writeString(1, getWatchedUserUuid());
        }
        if (this.f17830f != C8316b.Unknown.getNumber()) {
            codedOutputStream.writeEnum(2, this.f17830f);
        }
        double d = this.f17831g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(3, d);
        }
        double d2 = this.f17832h;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(4, d2);
        }
        double d3 = this.f17833i;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(5, d3);
        }
        if (this.f17834j != C6847b.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(6, this.f17834j);
        }
        if (this.f17835k != null) {
            codedOutputStream.writeMessage(7, getOriginalEta());
        }
        long j = this.f17836l;
        if (j != 0) {
            codedOutputStream.writeInt64(8, j);
        }
        if (this.f17837m != null) {
            codedOutputStream.writeMessage(9, getExpectedWakeup());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17919b(Timestamp timestamp) {
        if (timestamp != null) {
            this.f17835k = timestamp;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17918a(String str) {
        if (str != null) {
            this.f17829e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17917a(C8316b bVar) {
        if (bVar != null) {
            this.f17830f = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17907a(double d) {
        this.f17833i = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17910a(C6847b bVar) {
        if (bVar != null) {
            this.f17834j = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17908a(long j) {
        this.f17836l = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17909a(Timestamp timestamp) {
        if (timestamp != null) {
            this.f17837m = timestamp;
            return;
        }
        throw new NullPointerException();
    }
}
