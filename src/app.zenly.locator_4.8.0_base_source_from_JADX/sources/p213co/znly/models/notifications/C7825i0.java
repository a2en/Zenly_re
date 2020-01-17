package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p213co.znly.models.services.usermonitor.C8316b;
import p213co.znly.models.services.usermonitor.C8322e;
import p213co.znly.models.sleepdetection.C8408b.C8414d;

/* renamed from: co.znly.models.notifications.i0 */
public final class C7825i0 extends GeneratedMessageLite<C7825i0, C7826a> implements NotificationProto$UserMonitorNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final C7825i0 f19557t = new C7825i0();

    /* renamed from: u */
    private static volatile Parser<C7825i0> f19558u;

    /* renamed from: e */
    private UserProto$User f19559e;

    /* renamed from: f */
    private int f19560f;

    /* renamed from: g */
    private int f19561g;

    /* renamed from: h */
    private Timestamp f19562h;

    /* renamed from: i */
    private Timestamp f19563i;

    /* renamed from: j */
    private Timestamp f19564j;

    /* renamed from: k */
    private Timestamp f19565k;

    /* renamed from: l */
    private Timestamp f19566l;

    /* renamed from: m */
    private Timestamp f19567m;

    /* renamed from: n */
    private int f19568n;

    /* renamed from: o */
    private int f19569o;

    /* renamed from: p */
    private int f19570p;

    /* renamed from: q */
    private int f19571q;

    /* renamed from: r */
    private Duration f19572r;

    /* renamed from: s */
    private int f19573s;

    /* renamed from: co.znly.models.notifications.i0$a */
    public static final class C7826a extends Builder<C7825i0, C7826a> implements NotificationProto$UserMonitorNotificationOrBuilder {
        /* synthetic */ C7826a(C7790a aVar) {
            this();
        }

        public Timestamp getArrivalTime() {
            return ((C7825i0) this.instance).getArrivalTime();
        }

        public int getConfidenceLevelDepartureTime() {
            return ((C7825i0) this.instance).getConfidenceLevelDepartureTime();
        }

        public Timestamp getCurrentEta() {
            return ((C7825i0) this.instance).getCurrentEta();
        }

        public Timestamp getDepartureTime() {
            return ((C7825i0) this.instance).getDepartureTime();
        }

        public C8316b getEventType() {
            return ((C7825i0) this.instance).getEventType();
        }

        public int getEventTypeValue() {
            return ((C7825i0) this.instance).getEventTypeValue();
        }

        public Timestamp getOriginalEta() {
            return ((C7825i0) this.instance).getOriginalEta();
        }

        public C6847b getPlaceDestination() {
            return ((C7825i0) this.instance).getPlaceDestination();
        }

        public int getPlaceDestinationValue() {
            return ((C7825i0) this.instance).getPlaceDestinationValue();
        }

        public C6847b getPlaceOrigin() {
            return ((C7825i0) this.instance).getPlaceOrigin();
        }

        public int getPlaceOriginValue() {
            return ((C7825i0) this.instance).getPlaceOriginValue();
        }

        public C6847b getPlaceOriginalDestination() {
            return ((C7825i0) this.instance).getPlaceOriginalDestination();
        }

        public int getPlaceOriginalDestinationValue() {
            return ((C7825i0) this.instance).getPlaceOriginalDestinationValue();
        }

        public C8322e getReasonOfCancel() {
            return ((C7825i0) this.instance).getReasonOfCancel();
        }

        public int getReasonOfCancelValue() {
            return ((C7825i0) this.instance).getReasonOfCancelValue();
        }

        public Duration getSleepDuration() {
            return ((C7825i0) this.instance).getSleepDuration();
        }

        public Timestamp getUpdatedEta() {
            return ((C7825i0) this.instance).getUpdatedEta();
        }

        public UserProto$User getUser() {
            return ((C7825i0) this.instance).getUser();
        }

        public Timestamp getValidUntil() {
            return ((C7825i0) this.instance).getValidUntil();
        }

        public C8414d getWakeUpType() {
            return ((C7825i0) this.instance).getWakeUpType();
        }

        public int getWakeUpTypeValue() {
            return ((C7825i0) this.instance).getWakeUpTypeValue();
        }

        public boolean hasArrivalTime() {
            return ((C7825i0) this.instance).hasArrivalTime();
        }

        public boolean hasCurrentEta() {
            return ((C7825i0) this.instance).hasCurrentEta();
        }

        public boolean hasDepartureTime() {
            return ((C7825i0) this.instance).hasDepartureTime();
        }

        public boolean hasOriginalEta() {
            return ((C7825i0) this.instance).hasOriginalEta();
        }

        public boolean hasSleepDuration() {
            return ((C7825i0) this.instance).hasSleepDuration();
        }

        public boolean hasUpdatedEta() {
            return ((C7825i0) this.instance).hasUpdatedEta();
        }

        public boolean hasUser() {
            return ((C7825i0) this.instance).hasUser();
        }

        public boolean hasValidUntil() {
            return ((C7825i0) this.instance).hasValidUntil();
        }

        private C7826a() {
            super(C7825i0.f19557t);
        }
    }

    static {
        f19557t.makeImmutable();
    }

    private C7825i0() {
    }

    public static C7825i0 getDefaultInstance() {
        return f19557t;
    }

    public static Parser<C7825i0> parser() {
        return f19557t.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7825i0();
            case 2:
                return f19557t;
            case 3:
                return null;
            case 4:
                return new C7826a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7825i0 i0Var = (C7825i0) obj2;
                this.f19559e = (UserProto$User) visitor.visitMessage(this.f19559e, i0Var.f19559e);
                this.f19560f = visitor.visitInt(this.f19560f != 0, this.f19560f, i0Var.f19560f != 0, i0Var.f19560f);
                this.f19561g = visitor.visitInt(this.f19561g != 0, this.f19561g, i0Var.f19561g != 0, i0Var.f19561g);
                this.f19562h = (Timestamp) visitor.visitMessage(this.f19562h, i0Var.f19562h);
                this.f19563i = (Timestamp) visitor.visitMessage(this.f19563i, i0Var.f19563i);
                this.f19564j = (Timestamp) visitor.visitMessage(this.f19564j, i0Var.f19564j);
                this.f19565k = (Timestamp) visitor.visitMessage(this.f19565k, i0Var.f19565k);
                this.f19566l = (Timestamp) visitor.visitMessage(this.f19566l, i0Var.f19566l);
                this.f19567m = (Timestamp) visitor.visitMessage(this.f19567m, i0Var.f19567m);
                this.f19568n = visitor.visitInt(this.f19568n != 0, this.f19568n, i0Var.f19568n != 0, i0Var.f19568n);
                this.f19569o = visitor.visitInt(this.f19569o != 0, this.f19569o, i0Var.f19569o != 0, i0Var.f19569o);
                this.f19570p = visitor.visitInt(this.f19570p != 0, this.f19570p, i0Var.f19570p != 0, i0Var.f19570p);
                this.f19571q = visitor.visitInt(this.f19571q != 0, this.f19571q, i0Var.f19571q != 0, i0Var.f19571q);
                this.f19572r = (Duration) visitor.visitMessage(this.f19572r, i0Var.f19572r);
                boolean z2 = this.f19573s != 0;
                int i = this.f19573s;
                if (i0Var.f19573s != 0) {
                    z = true;
                }
                this.f19573s = visitor.visitInt(z2, i, z, i0Var.f19573s);
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
                                Builder builder = this.f19559e != null ? (C6925a) this.f19559e.toBuilder() : null;
                                this.f19559e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f19559e);
                                    this.f19559e = (UserProto$User) builder.buildPartial();
                                    break;
                                }
                            case 16:
                                this.f19560f = codedInputStream.readEnum();
                                break;
                            case 24:
                                this.f19561g = codedInputStream.readEnum();
                                break;
                            case 34:
                                Builder builder2 = this.f19562h != null ? (Timestamp.Builder) this.f19562h.toBuilder() : null;
                                this.f19562h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f19562h);
                                    this.f19562h = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 42:
                                Builder builder3 = this.f19563i != null ? (Timestamp.Builder) this.f19563i.toBuilder() : null;
                                this.f19563i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f19563i);
                                    this.f19563i = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 50:
                                Builder builder4 = this.f19564j != null ? (Timestamp.Builder) this.f19564j.toBuilder() : null;
                                this.f19564j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f19564j);
                                    this.f19564j = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 58:
                                Builder builder5 = this.f19565k != null ? (Timestamp.Builder) this.f19565k.toBuilder() : null;
                                this.f19565k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f19565k);
                                    this.f19565k = (Timestamp) builder5.buildPartial();
                                    break;
                                }
                            case 66:
                                Builder builder6 = this.f19566l != null ? (Timestamp.Builder) this.f19566l.toBuilder() : null;
                                this.f19566l = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder6 == null) {
                                    break;
                                } else {
                                    builder6.mergeFrom(this.f19566l);
                                    this.f19566l = (Timestamp) builder6.buildPartial();
                                    break;
                                }
                            case 74:
                                Builder builder7 = this.f19567m != null ? (Timestamp.Builder) this.f19567m.toBuilder() : null;
                                this.f19567m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder7 == null) {
                                    break;
                                } else {
                                    builder7.mergeFrom(this.f19567m);
                                    this.f19567m = (Timestamp) builder7.buildPartial();
                                    break;
                                }
                            case 80:
                                this.f19568n = codedInputStream.readEnum();
                                break;
                            case 88:
                                this.f19569o = codedInputStream.readEnum();
                                break;
                            case 96:
                                this.f19570p = codedInputStream.readEnum();
                                break;
                            case 104:
                                this.f19571q = codedInputStream.readEnum();
                                break;
                            case 114:
                                Builder builder8 = this.f19572r != null ? (Duration.Builder) this.f19572r.toBuilder() : null;
                                this.f19572r = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder8 == null) {
                                    break;
                                } else {
                                    builder8.mergeFrom(this.f19572r);
                                    this.f19572r = (Duration) builder8.buildPartial();
                                    break;
                                }
                            case 120:
                                this.f19573s = codedInputStream.readInt32();
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
                if (f19558u == null) {
                    synchronized (C7825i0.class) {
                        if (f19558u == null) {
                            f19558u = new DefaultInstanceBasedParser(f19557t);
                        }
                    }
                }
                return f19558u;
            default:
                throw new UnsupportedOperationException();
        }
        return f19557t;
    }

    public Timestamp getArrivalTime() {
        Timestamp timestamp = this.f19564j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getConfidenceLevelDepartureTime() {
        return this.f19573s;
    }

    public Timestamp getCurrentEta() {
        Timestamp timestamp = this.f19567m;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getDepartureTime() {
        Timestamp timestamp = this.f19563i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C8316b getEventType() {
        C8316b a = C8316b.m19407a(this.f19560f);
        return a == null ? C8316b.UNRECOGNIZED : a;
    }

    public int getEventTypeValue() {
        return this.f19560f;
    }

    public Timestamp getOriginalEta() {
        Timestamp timestamp = this.f19565k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6847b getPlaceDestination() {
        C6847b a = C6847b.m17595a(this.f19569o);
        return a == null ? C6847b.UNRECOGNIZED : a;
    }

    public int getPlaceDestinationValue() {
        return this.f19569o;
    }

    public C6847b getPlaceOrigin() {
        C6847b a = C6847b.m17595a(this.f19568n);
        return a == null ? C6847b.UNRECOGNIZED : a;
    }

    public int getPlaceOriginValue() {
        return this.f19568n;
    }

    public C6847b getPlaceOriginalDestination() {
        C6847b a = C6847b.m17595a(this.f19570p);
        return a == null ? C6847b.UNRECOGNIZED : a;
    }

    public int getPlaceOriginalDestinationValue() {
        return this.f19570p;
    }

    public C8322e getReasonOfCancel() {
        C8322e a = C8322e.m19409a(this.f19561g);
        return a == null ? C8322e.UNRECOGNIZED : a;
    }

    public int getReasonOfCancelValue() {
        return this.f19561g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19559e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser());
        }
        if (this.f19560f != C8316b.Unknown.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f19560f);
        }
        if (this.f19561g != C8322e.EventTriggered.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f19561g);
        }
        if (this.f19562h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getValidUntil());
        }
        if (this.f19563i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getDepartureTime());
        }
        if (this.f19564j != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getArrivalTime());
        }
        if (this.f19565k != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getOriginalEta());
        }
        if (this.f19566l != null) {
            i2 += CodedOutputStream.computeMessageSize(8, getUpdatedEta());
        }
        if (this.f19567m != null) {
            i2 += CodedOutputStream.computeMessageSize(9, getCurrentEta());
        }
        if (this.f19568n != C6847b.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(10, this.f19568n);
        }
        if (this.f19569o != C6847b.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(11, this.f19569o);
        }
        if (this.f19570p != C6847b.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(12, this.f19570p);
        }
        if (this.f19571q != C8414d.WAKE_UP_TYPE_UNKNOW.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(13, this.f19571q);
        }
        if (this.f19572r != null) {
            i2 += CodedOutputStream.computeMessageSize(14, getSleepDuration());
        }
        int i3 = this.f19573s;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(15, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Duration getSleepDuration() {
        Duration duration = this.f19572r;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public Timestamp getUpdatedEta() {
        Timestamp timestamp = this.f19566l;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f19559e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f19562h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C8414d getWakeUpType() {
        C8414d a = C8414d.m19499a(this.f19571q);
        return a == null ? C8414d.UNRECOGNIZED : a;
    }

    public int getWakeUpTypeValue() {
        return this.f19571q;
    }

    public boolean hasArrivalTime() {
        return this.f19564j != null;
    }

    public boolean hasCurrentEta() {
        return this.f19567m != null;
    }

    public boolean hasDepartureTime() {
        return this.f19563i != null;
    }

    public boolean hasOriginalEta() {
        return this.f19565k != null;
    }

    public boolean hasSleepDuration() {
        return this.f19572r != null;
    }

    public boolean hasUpdatedEta() {
        return this.f19566l != null;
    }

    public boolean hasUser() {
        return this.f19559e != null;
    }

    public boolean hasValidUntil() {
        return this.f19562h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19559e != null) {
            codedOutputStream.writeMessage(1, getUser());
        }
        if (this.f19560f != C8316b.Unknown.getNumber()) {
            codedOutputStream.writeEnum(2, this.f19560f);
        }
        if (this.f19561g != C8322e.EventTriggered.getNumber()) {
            codedOutputStream.writeEnum(3, this.f19561g);
        }
        if (this.f19562h != null) {
            codedOutputStream.writeMessage(4, getValidUntil());
        }
        if (this.f19563i != null) {
            codedOutputStream.writeMessage(5, getDepartureTime());
        }
        if (this.f19564j != null) {
            codedOutputStream.writeMessage(6, getArrivalTime());
        }
        if (this.f19565k != null) {
            codedOutputStream.writeMessage(7, getOriginalEta());
        }
        if (this.f19566l != null) {
            codedOutputStream.writeMessage(8, getUpdatedEta());
        }
        if (this.f19567m != null) {
            codedOutputStream.writeMessage(9, getCurrentEta());
        }
        if (this.f19568n != C6847b.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(10, this.f19568n);
        }
        if (this.f19569o != C6847b.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(11, this.f19569o);
        }
        if (this.f19570p != C6847b.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(12, this.f19570p);
        }
        if (this.f19571q != C8414d.WAKE_UP_TYPE_UNKNOW.getNumber()) {
            codedOutputStream.writeEnum(13, this.f19571q);
        }
        if (this.f19572r != null) {
            codedOutputStream.writeMessage(14, getSleepDuration());
        }
        int i = this.f19573s;
        if (i != 0) {
            codedOutputStream.writeInt32(15, i);
        }
    }
}
