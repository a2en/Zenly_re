package p213co.znly.models.sleepdetection;

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
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.PlaceProto$Place.C6844b;

/* renamed from: co.znly.models.sleepdetection.b */
public final class C8408b extends GeneratedMessageLite<C8408b, C8411b> implements SleepDetectionProto$SleepStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C8408b f21276q = new C8408b();

    /* renamed from: r */
    private static volatile Parser<C8408b> f21277r;

    /* renamed from: e */
    private String f21278e;

    /* renamed from: f */
    private boolean f21279f;

    /* renamed from: g */
    private int f21280g;

    /* renamed from: h */
    private Timestamp f21281h;

    /* renamed from: i */
    private Timestamp f21282i;

    /* renamed from: j */
    private Timestamp f21283j;

    /* renamed from: k */
    private String f21284k;

    /* renamed from: l */
    private int f21285l;

    /* renamed from: m */
    private int f21286m;

    /* renamed from: n */
    private Timestamp f21287n;

    /* renamed from: o */
    private PlaceProto$Place f21288o;

    /* renamed from: p */
    private boolean f21289p;

    /* renamed from: co.znly.models.sleepdetection.b$a */
    public enum C8409a implements EnumLite {
        BED_TIME_TYPE_UNKNOWN(0),
        BED_TIME_TYPE_DEFAULT(1),
        BED_TIME_TYPE_WENT_TO_BED_LATE(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21295e;

        /* renamed from: co.znly.models.sleepdetection.b$a$a */
        class C8410a implements EnumLiteMap<C8409a> {
            C8410a() {
            }

            public C8409a findValueByNumber(int i) {
                return C8409a.m19497a(i);
            }
        }

        static {
            new C8410a();
        }

        private C8409a(int i) {
            this.f21295e = i;
        }

        /* renamed from: a */
        public static C8409a m19497a(int i) {
            if (i == 0) {
                return BED_TIME_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return BED_TIME_TYPE_DEFAULT;
            }
            if (i != 2) {
                return null;
            }
            return BED_TIME_TYPE_WENT_TO_BED_LATE;
        }

        public final int getNumber() {
            return this.f21295e;
        }
    }

    /* renamed from: co.znly.models.sleepdetection.b$b */
    public static final class C8411b extends Builder<C8408b, C8411b> implements SleepDetectionProto$SleepStateOrBuilder {
        /* synthetic */ C8411b(C8407a aVar) {
            this();
        }

        public C8409a getBedTimeType() {
            return ((C8408b) this.instance).getBedTimeType();
        }

        public int getBedTimeTypeValue() {
            return ((C8408b) this.instance).getBedTimeTypeValue();
        }

        public Timestamp getBedTimestamp() {
            return ((C8408b) this.instance).getBedTimestamp();
        }

        public Timestamp getEstimatedWakeUpTimestamp() {
            return ((C8408b) this.instance).getEstimatedWakeUpTimestamp();
        }

        public boolean getIsInSleepPeriod() {
            return ((C8408b) this.instance).getIsInSleepPeriod();
        }

        public boolean getIsSleeping() {
            return ((C8408b) this.instance).getIsSleeping();
        }

        public String getNightId() {
            return ((C8408b) this.instance).getNightId();
        }

        public ByteString getNightIdBytes() {
            return ((C8408b) this.instance).getNightIdBytes();
        }

        public Timestamp getOversleepingTimestamp() {
            return ((C8408b) this.instance).getOversleepingTimestamp();
        }

        public PlaceProto$Place getPlace() {
            return ((C8408b) this.instance).getPlace();
        }

        public C8412c getSleepState() {
            return ((C8408b) this.instance).getSleepState();
        }

        public int getSleepStateValue() {
            return ((C8408b) this.instance).getSleepStateValue();
        }

        public String getUserId() {
            return ((C8408b) this.instance).getUserId();
        }

        public ByteString getUserIdBytes() {
            return ((C8408b) this.instance).getUserIdBytes();
        }

        public Timestamp getWakeUpTimestamp() {
            return ((C8408b) this.instance).getWakeUpTimestamp();
        }

        public C8414d getWakeUpType() {
            return ((C8408b) this.instance).getWakeUpType();
        }

        public int getWakeUpTypeValue() {
            return ((C8408b) this.instance).getWakeUpTypeValue();
        }

        public boolean hasBedTimestamp() {
            return ((C8408b) this.instance).hasBedTimestamp();
        }

        public boolean hasEstimatedWakeUpTimestamp() {
            return ((C8408b) this.instance).hasEstimatedWakeUpTimestamp();
        }

        public boolean hasOversleepingTimestamp() {
            return ((C8408b) this.instance).hasOversleepingTimestamp();
        }

        public boolean hasPlace() {
            return ((C8408b) this.instance).hasPlace();
        }

        public boolean hasWakeUpTimestamp() {
            return ((C8408b) this.instance).hasWakeUpTimestamp();
        }

        private C8411b() {
            super(C8408b.f21276q);
        }
    }

    /* renamed from: co.znly.models.sleepdetection.b$c */
    public enum C8412c implements EnumLite {
        SLEEP_STATE_UNKNOWN(0),
        SLEEP_STATE_ASLEEP(1),
        SLEEP_STATE_AWAKE(2),
        SLEEP_STATE_PROBABLY_ASLEEP(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21302e;

        /* renamed from: co.znly.models.sleepdetection.b$c$a */
        class C8413a implements EnumLiteMap<C8412c> {
            C8413a() {
            }

            public C8412c findValueByNumber(int i) {
                return C8412c.m19498a(i);
            }
        }

        static {
            new C8413a();
        }

        private C8412c(int i) {
            this.f21302e = i;
        }

        /* renamed from: a */
        public static C8412c m19498a(int i) {
            if (i == 0) {
                return SLEEP_STATE_UNKNOWN;
            }
            if (i == 1) {
                return SLEEP_STATE_ASLEEP;
            }
            if (i == 2) {
                return SLEEP_STATE_AWAKE;
            }
            if (i != 3) {
                return null;
            }
            return SLEEP_STATE_PROBABLY_ASLEEP;
        }

        public final int getNumber() {
            return this.f21302e;
        }
    }

    /* renamed from: co.znly.models.sleepdetection.b$d */
    public enum C8414d implements EnumLite {
        WAKE_UP_TYPE_UNKNOW(0),
        WAKE_UP_TYPE_LONG_UNDER_SLEEPING(1),
        WAKE_UP_TYPE_UNDER_SLEEPING(2),
        WAKE_UP_TYPE_ON_TIME(3),
        WAKE_UP_TYPE_OVER_SLEEPING(4),
        WAKE_UP_TYPE_LONG_OVER_SLEEPING(5),
        WAKE_UP_TYPE_VERY_LONG_OVER_SLEEPING(6),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21312e;

        /* renamed from: co.znly.models.sleepdetection.b$d$a */
        class C8415a implements EnumLiteMap<C8414d> {
            C8415a() {
            }

            public C8414d findValueByNumber(int i) {
                return C8414d.m19499a(i);
            }
        }

        static {
            new C8415a();
        }

        private C8414d(int i) {
            this.f21312e = i;
        }

        /* renamed from: a */
        public static C8414d m19499a(int i) {
            switch (i) {
                case 0:
                    return WAKE_UP_TYPE_UNKNOW;
                case 1:
                    return WAKE_UP_TYPE_LONG_UNDER_SLEEPING;
                case 2:
                    return WAKE_UP_TYPE_UNDER_SLEEPING;
                case 3:
                    return WAKE_UP_TYPE_ON_TIME;
                case 4:
                    return WAKE_UP_TYPE_OVER_SLEEPING;
                case 5:
                    return WAKE_UP_TYPE_LONG_OVER_SLEEPING;
                case 6:
                    return WAKE_UP_TYPE_VERY_LONG_OVER_SLEEPING;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f21312e;
        }
    }

    static {
        f21276q.makeImmutable();
    }

    private C8408b() {
        String str = "";
        this.f21278e = str;
        this.f21284k = str;
    }

    public static C8411b newBuilder() {
        return (C8411b) f21276q.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8407a.f21275a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8408b();
            case 2:
                return f21276q;
            case 3:
                return null;
            case 4:
                return new C8411b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8408b bVar = (C8408b) obj2;
                this.f21278e = visitor.visitString(!this.f21278e.isEmpty(), this.f21278e, !bVar.f21278e.isEmpty(), bVar.f21278e);
                boolean z2 = this.f21279f;
                boolean z3 = bVar.f21279f;
                this.f21279f = visitor.visitBoolean(z2, z2, z3, z3);
                this.f21280g = visitor.visitInt(this.f21280g != 0, this.f21280g, bVar.f21280g != 0, bVar.f21280g);
                this.f21281h = (Timestamp) visitor.visitMessage(this.f21281h, bVar.f21281h);
                this.f21282i = (Timestamp) visitor.visitMessage(this.f21282i, bVar.f21282i);
                this.f21283j = (Timestamp) visitor.visitMessage(this.f21283j, bVar.f21283j);
                this.f21284k = visitor.visitString(!this.f21284k.isEmpty(), this.f21284k, !bVar.f21284k.isEmpty(), bVar.f21284k);
                this.f21285l = visitor.visitInt(this.f21285l != 0, this.f21285l, bVar.f21285l != 0, bVar.f21285l);
                boolean z4 = this.f21286m != 0;
                int i = this.f21286m;
                if (bVar.f21286m != 0) {
                    z = true;
                }
                this.f21286m = visitor.visitInt(z4, i, z, bVar.f21286m);
                this.f21287n = (Timestamp) visitor.visitMessage(this.f21287n, bVar.f21287n);
                this.f21288o = (PlaceProto$Place) visitor.visitMessage(this.f21288o, bVar.f21288o);
                boolean z5 = this.f21289p;
                boolean z6 = bVar.f21289p;
                this.f21289p = visitor.visitBoolean(z5, z5, z6, z6);
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
                                this.f21278e = codedInputStream.readStringRequireUtf8();
                                break;
                            case 16:
                                this.f21279f = codedInputStream.readBool();
                                break;
                            case 26:
                                Builder builder = this.f21281h != null ? (Timestamp.Builder) this.f21281h.toBuilder() : null;
                                this.f21281h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f21281h);
                                    this.f21281h = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 34:
                                Builder builder2 = this.f21282i != null ? (Timestamp.Builder) this.f21282i.toBuilder() : null;
                                this.f21282i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f21282i);
                                    this.f21282i = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 42:
                                this.f21284k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                Builder builder3 = this.f21283j != null ? (Timestamp.Builder) this.f21283j.toBuilder() : null;
                                this.f21283j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f21283j);
                                    this.f21283j = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 72:
                                this.f21285l = codedInputStream.readEnum();
                                break;
                            case 80:
                                this.f21286m = codedInputStream.readEnum();
                                break;
                            case 96:
                                this.f21280g = codedInputStream.readEnum();
                                break;
                            case 106:
                                Builder builder4 = this.f21287n != null ? (Timestamp.Builder) this.f21287n.toBuilder() : null;
                                this.f21287n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f21287n);
                                    this.f21287n = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 114:
                                Builder builder5 = this.f21288o != null ? (C6844b) this.f21288o.toBuilder() : null;
                                this.f21288o = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f21288o);
                                    this.f21288o = (PlaceProto$Place) builder5.buildPartial();
                                    break;
                                }
                            case 120:
                                this.f21289p = codedInputStream.readBool();
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
                if (f21277r == null) {
                    synchronized (C8408b.class) {
                        if (f21277r == null) {
                            f21277r = new DefaultInstanceBasedParser(f21276q);
                        }
                    }
                }
                return f21277r;
            default:
                throw new UnsupportedOperationException();
        }
        return f21276q;
    }

    public C8409a getBedTimeType() {
        C8409a a = C8409a.m19497a(this.f21285l);
        return a == null ? C8409a.UNRECOGNIZED : a;
    }

    public int getBedTimeTypeValue() {
        return this.f21285l;
    }

    public Timestamp getBedTimestamp() {
        Timestamp timestamp = this.f21282i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getEstimatedWakeUpTimestamp() {
        Timestamp timestamp = this.f21281h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getIsInSleepPeriod() {
        return this.f21289p;
    }

    public boolean getIsSleeping() {
        return this.f21279f;
    }

    public String getNightId() {
        return this.f21284k;
    }

    public ByteString getNightIdBytes() {
        return ByteString.copyFromUtf8(this.f21284k);
    }

    public Timestamp getOversleepingTimestamp() {
        Timestamp timestamp = this.f21287n;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public PlaceProto$Place getPlace() {
        PlaceProto$Place placeProto$Place = this.f21288o;
        return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21278e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserId());
        }
        boolean z = this.f21279f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        if (this.f21281h != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getEstimatedWakeUpTimestamp());
        }
        if (this.f21282i != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getBedTimestamp());
        }
        if (!this.f21284k.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getNightId());
        }
        if (this.f21283j != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getWakeUpTimestamp());
        }
        if (this.f21285l != C8409a.BED_TIME_TYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(9, this.f21285l);
        }
        if (this.f21286m != C8414d.WAKE_UP_TYPE_UNKNOW.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(10, this.f21286m);
        }
        if (this.f21280g != C8412c.SLEEP_STATE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(12, this.f21280g);
        }
        if (this.f21287n != null) {
            i2 += CodedOutputStream.computeMessageSize(13, getOversleepingTimestamp());
        }
        if (this.f21288o != null) {
            i2 += CodedOutputStream.computeMessageSize(14, getPlace());
        }
        boolean z2 = this.f21289p;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(15, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C8412c getSleepState() {
        C8412c a = C8412c.m19498a(this.f21280g);
        return a == null ? C8412c.UNRECOGNIZED : a;
    }

    public int getSleepStateValue() {
        return this.f21280g;
    }

    public String getUserId() {
        return this.f21278e;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.f21278e);
    }

    public Timestamp getWakeUpTimestamp() {
        Timestamp timestamp = this.f21283j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C8414d getWakeUpType() {
        C8414d a = C8414d.m19499a(this.f21286m);
        return a == null ? C8414d.UNRECOGNIZED : a;
    }

    public int getWakeUpTypeValue() {
        return this.f21286m;
    }

    public boolean hasBedTimestamp() {
        return this.f21282i != null;
    }

    public boolean hasEstimatedWakeUpTimestamp() {
        return this.f21281h != null;
    }

    public boolean hasOversleepingTimestamp() {
        return this.f21287n != null;
    }

    public boolean hasPlace() {
        return this.f21288o != null;
    }

    public boolean hasWakeUpTimestamp() {
        return this.f21283j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21278e.isEmpty()) {
            codedOutputStream.writeString(1, getUserId());
        }
        boolean z = this.f21279f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        if (this.f21281h != null) {
            codedOutputStream.writeMessage(3, getEstimatedWakeUpTimestamp());
        }
        if (this.f21282i != null) {
            codedOutputStream.writeMessage(4, getBedTimestamp());
        }
        if (!this.f21284k.isEmpty()) {
            codedOutputStream.writeString(5, getNightId());
        }
        if (this.f21283j != null) {
            codedOutputStream.writeMessage(6, getWakeUpTimestamp());
        }
        if (this.f21285l != C8409a.BED_TIME_TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(9, this.f21285l);
        }
        if (this.f21286m != C8414d.WAKE_UP_TYPE_UNKNOW.getNumber()) {
            codedOutputStream.writeEnum(10, this.f21286m);
        }
        if (this.f21280g != C8412c.SLEEP_STATE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(12, this.f21280g);
        }
        if (this.f21287n != null) {
            codedOutputStream.writeMessage(13, getOversleepingTimestamp());
        }
        if (this.f21288o != null) {
            codedOutputStream.writeMessage(14, getPlace());
        }
        boolean z2 = this.f21289p;
        if (z2) {
            codedOutputStream.writeBool(15, z2);
        }
    }
}
