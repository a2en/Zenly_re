package p213co.znly.models.verify;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter.Converter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo */
public final class VerifyInfoProto$VerifyInfo extends GeneratedMessageLite<VerifyInfoProto$VerifyInfo, C8444c> implements VerifyInfoProto$VerifyInfoOrBuilder {

    /* renamed from: r */
    private static final Converter<Integer, C8449b> f21414r = new C8441a();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final VerifyInfoProto$VerifyInfo f21415s = new VerifyInfoProto$VerifyInfo();

    /* renamed from: t */
    private static volatile Parser<VerifyInfoProto$VerifyInfo> f21416t;

    /* renamed from: e */
    private int f21417e;

    /* renamed from: f */
    private IntList f21418f = GeneratedMessageLite.emptyIntList();

    /* renamed from: g */
    private int f21419g;

    /* renamed from: h */
    private Duration f21420h;

    /* renamed from: i */
    private ProtobufList<C8442b> f21421i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: j */
    private Duration f21422j;

    /* renamed from: k */
    private Timestamp f21423k;

    /* renamed from: l */
    private int f21424l;

    /* renamed from: m */
    private Timestamp f21425m;

    /* renamed from: n */
    private int f21426n;

    /* renamed from: o */
    private int f21427o;

    /* renamed from: p */
    private boolean f21428p;

    /* renamed from: q */
    private int f21429q;

    /* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo$AutomaticEventOrBuilder */
    public interface AutomaticEventOrBuilder extends MessageLiteOrBuilder {
        Duration getTimer();

        C8449b getType();

        int getTypeValue();

        boolean hasTimer();
    }

    /* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo$a */
    class C8441a implements Converter<Integer, C8449b> {
        C8441a() {
        }

        /* renamed from: a */
        public C8449b convert(Integer num) {
            C8449b a = C8449b.m19513a(num.intValue());
            return a == null ? C8449b.UNRECOGNIZED : a;
        }
    }

    /* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo$b */
    public static final class C8442b extends GeneratedMessageLite<C8442b, C8443a> implements AutomaticEventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C8442b f21430g = new C8442b();

        /* renamed from: h */
        private static volatile Parser<C8442b> f21431h;

        /* renamed from: e */
        private int f21432e;

        /* renamed from: f */
        private Duration f21433f;

        /* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo$b$a */
        public static final class C8443a extends Builder<C8442b, C8443a> implements AutomaticEventOrBuilder {
            /* synthetic */ C8443a(C8453d dVar) {
                this();
            }

            public Duration getTimer() {
                return ((C8442b) this.instance).getTimer();
            }

            public C8449b getType() {
                return ((C8442b) this.instance).getType();
            }

            public int getTypeValue() {
                return ((C8442b) this.instance).getTypeValue();
            }

            public boolean hasTimer() {
                return ((C8442b) this.instance).hasTimer();
            }

            private C8443a() {
                super(C8442b.f21430g);
            }
        }

        static {
            f21430g.makeImmutable();
        }

        private C8442b() {
        }

        public static Parser<C8442b> parser() {
            return f21430g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8453d.f21472a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C8442b();
                case 2:
                    return f21430g;
                case 3:
                    return null;
                case 4:
                    return new C8443a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C8442b bVar = (C8442b) obj2;
                    boolean z2 = this.f21432e != 0;
                    int i = this.f21432e;
                    if (bVar.f21432e != 0) {
                        z = true;
                    }
                    this.f21432e = visitor.visitInt(z2, i, z, bVar.f21432e);
                    this.f21433f = (Duration) visitor.visitMessage(this.f21433f, bVar.f21433f);
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
                                    this.f21432e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f21433f != null ? (Duration.Builder) this.f21433f.toBuilder() : null;
                                    this.f21433f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f21433f);
                                        this.f21433f = (Duration) builder.buildPartial();
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
                    if (f21431h == null) {
                        synchronized (C8442b.class) {
                            if (f21431h == null) {
                                f21431h = new DefaultInstanceBasedParser(f21430g);
                            }
                        }
                    }
                    return f21431h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f21430g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f21432e != C8449b.CAPABILITY_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f21432e);
            }
            if (this.f21433f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getTimer());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Duration getTimer() {
            Duration duration = this.f21433f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public C8449b getType() {
            C8449b a = C8449b.m19513a(this.f21432e);
            return a == null ? C8449b.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.f21432e;
        }

        public boolean hasTimer() {
            return this.f21433f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f21432e != C8449b.CAPABILITY_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f21432e);
            }
            if (this.f21433f != null) {
                codedOutputStream.writeMessage(2, getTimer());
            }
        }
    }

    /* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo$c */
    public static final class C8444c extends Builder<VerifyInfoProto$VerifyInfo, C8444c> implements VerifyInfoProto$VerifyInfoOrBuilder {
        /* synthetic */ C8444c(C8453d dVar) {
            this();
        }

        public Duration getActionInnervation() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getActionInnervation();
        }

        public C8442b getAutomaticEvents(int i) {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getAutomaticEvents(i);
        }

        public int getAutomaticEventsCount() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getAutomaticEventsCount();
        }

        public List<C8442b> getAutomaticEventsList() {
            return Collections.unmodifiableList(((VerifyInfoProto$VerifyInfo) this.instance).getAutomaticEventsList());
        }

        public int getChallengeSize() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getChallengeSize();
        }

        public C8454e getChallengeType() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getChallengeType();
        }

        public int getChallengeTypeValue() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getChallengeTypeValue();
        }

        public Timestamp getCreatedAt() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getCreatedAt();
        }

        public Timestamp getExpireAt() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getExpireAt();
        }

        public boolean getHasExpired() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getHasExpired();
        }

        public Duration getNextEventTimer() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getNextEventTimer();
        }

        public int getNumberOfActionAvailable() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getNumberOfActionAvailable();
        }

        public C8449b getPossibleEventTypes(int i) {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getPossibleEventTypes(i);
        }

        public int getPossibleEventTypesCount() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getPossibleEventTypesCount();
        }

        public List<C8449b> getPossibleEventTypesList() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getPossibleEventTypesList();
        }

        public int getPossibleEventTypesValue(int i) {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getPossibleEventTypesValue(i);
        }

        public List<Integer> getPossibleEventTypesValueList() {
            return Collections.unmodifiableList(((VerifyInfoProto$VerifyInfo) this.instance).getPossibleEventTypesValueList());
        }

        public int getTriesLeft() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getTriesLeft();
        }

        public C8445d getVerificationMode() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getVerificationMode();
        }

        public int getVerificationModeValue() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).getVerificationModeValue();
        }

        public boolean hasActionInnervation() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).hasActionInnervation();
        }

        public boolean hasCreatedAt() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).hasCreatedAt();
        }

        public boolean hasExpireAt() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).hasExpireAt();
        }

        public boolean hasNextEventTimer() {
            return ((VerifyInfoProto$VerifyInfo) this.instance).hasNextEventTimer();
        }

        private C8444c() {
            super(VerifyInfoProto$VerifyInfo.f21415s);
        }
    }

    /* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo$d */
    public enum C8445d implements EnumLite {
        VERIFICATION_MODE_UNKNOWN(0),
        VERIFICATION_MODE_DEFAULT(1),
        VERIFICATION_MODE_ANDROID_AUTOMATIC_VALIDATION(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21439e;

        /* renamed from: co.znly.models.verify.VerifyInfoProto$VerifyInfo$d$a */
        class C8446a implements EnumLiteMap<C8445d> {
            C8446a() {
            }

            public C8445d findValueByNumber(int i) {
                return C8445d.m19511a(i);
            }
        }

        static {
            new C8446a();
        }

        private C8445d(int i) {
            this.f21439e = i;
        }

        /* renamed from: a */
        public static C8445d m19511a(int i) {
            if (i == 0) {
                return VERIFICATION_MODE_UNKNOWN;
            }
            if (i == 1) {
                return VERIFICATION_MODE_DEFAULT;
            }
            if (i != 2) {
                return null;
            }
            return VERIFICATION_MODE_ANDROID_AUTOMATIC_VALIDATION;
        }

        public final int getNumber() {
            return this.f21439e;
        }
    }

    static {
        f21415s.makeImmutable();
    }

    private VerifyInfoProto$VerifyInfo() {
    }

    public static VerifyInfoProto$VerifyInfo getDefaultInstance() {
        return f21415s;
    }

    public static Parser<VerifyInfoProto$VerifyInfo> parser() {
        return f21415s.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8453d.f21472a[methodToInvoke.ordinal()]) {
            case 1:
                return new VerifyInfoProto$VerifyInfo();
            case 2:
                return f21415s;
            case 3:
                this.f21418f.makeImmutable();
                this.f21421i.makeImmutable();
                return null;
            case 4:
                return new C8444c(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo = (VerifyInfoProto$VerifyInfo) obj2;
                this.f21418f = visitor.visitIntList(this.f21418f, verifyInfoProto$VerifyInfo.f21418f);
                this.f21419g = visitor.visitInt(this.f21419g != 0, this.f21419g, verifyInfoProto$VerifyInfo.f21419g != 0, verifyInfoProto$VerifyInfo.f21419g);
                this.f21420h = (Duration) visitor.visitMessage(this.f21420h, verifyInfoProto$VerifyInfo.f21420h);
                this.f21421i = visitor.visitList(this.f21421i, verifyInfoProto$VerifyInfo.f21421i);
                this.f21422j = (Duration) visitor.visitMessage(this.f21422j, verifyInfoProto$VerifyInfo.f21422j);
                this.f21423k = (Timestamp) visitor.visitMessage(this.f21423k, verifyInfoProto$VerifyInfo.f21423k);
                this.f21424l = visitor.visitInt(this.f21424l != 0, this.f21424l, verifyInfoProto$VerifyInfo.f21424l != 0, verifyInfoProto$VerifyInfo.f21424l);
                this.f21425m = (Timestamp) visitor.visitMessage(this.f21425m, verifyInfoProto$VerifyInfo.f21425m);
                this.f21426n = visitor.visitInt(this.f21426n != 0, this.f21426n, verifyInfoProto$VerifyInfo.f21426n != 0, verifyInfoProto$VerifyInfo.f21426n);
                this.f21427o = visitor.visitInt(this.f21427o != 0, this.f21427o, verifyInfoProto$VerifyInfo.f21427o != 0, verifyInfoProto$VerifyInfo.f21427o);
                boolean z2 = this.f21428p;
                boolean z3 = verifyInfoProto$VerifyInfo.f21428p;
                this.f21428p = visitor.visitBoolean(z2, z2, z3, z3);
                boolean z4 = this.f21429q != 0;
                int i = this.f21429q;
                if (verifyInfoProto$VerifyInfo.f21429q != 0) {
                    z = true;
                }
                this.f21429q = visitor.visitInt(z4, i, z, verifyInfoProto$VerifyInfo.f21429q);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21417e |= verifyInfoProto$VerifyInfo.f21417e;
                }
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
                            case 8:
                                if (!this.f21418f.isModifiable()) {
                                    this.f21418f = GeneratedMessageLite.mutableCopy(this.f21418f);
                                }
                                this.f21418f.addInt(codedInputStream.readEnum());
                                break;
                            case 10:
                                if (!this.f21418f.isModifiable()) {
                                    this.f21418f = GeneratedMessageLite.mutableCopy(this.f21418f);
                                }
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f21418f.addInt(codedInputStream.readEnum());
                                }
                                codedInputStream.popLimit(pushLimit);
                                break;
                            case 16:
                                this.f21419g = codedInputStream.readInt32();
                                break;
                            case 26:
                                Builder builder = this.f21420h != null ? (Duration.Builder) this.f21420h.toBuilder() : null;
                                this.f21420h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f21420h);
                                    this.f21420h = (Duration) builder.buildPartial();
                                    break;
                                }
                            case 34:
                                if (!this.f21421i.isModifiable()) {
                                    this.f21421i = GeneratedMessageLite.mutableCopy(this.f21421i);
                                }
                                this.f21421i.add(codedInputStream.readMessage(C8442b.parser(), extensionRegistryLite));
                                break;
                            case 42:
                                Builder builder2 = this.f21422j != null ? (Duration.Builder) this.f21422j.toBuilder() : null;
                                this.f21422j = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f21422j);
                                    this.f21422j = (Duration) builder2.buildPartial();
                                    break;
                                }
                            case 50:
                                Builder builder3 = this.f21423k != null ? (Timestamp.Builder) this.f21423k.toBuilder() : null;
                                this.f21423k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f21423k);
                                    this.f21423k = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 56:
                                this.f21424l = codedInputStream.readInt32();
                                break;
                            case 66:
                                Builder builder4 = this.f21425m != null ? (Timestamp.Builder) this.f21425m.toBuilder() : null;
                                this.f21425m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f21425m);
                                    this.f21425m = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 72:
                                this.f21426n = codedInputStream.readEnum();
                                break;
                            case 80:
                                this.f21427o = codedInputStream.readInt32();
                                break;
                            case 88:
                                this.f21428p = codedInputStream.readBool();
                                break;
                            case 96:
                                this.f21429q = codedInputStream.readEnum();
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
                if (f21416t == null) {
                    synchronized (VerifyInfoProto$VerifyInfo.class) {
                        if (f21416t == null) {
                            f21416t = new DefaultInstanceBasedParser(f21415s);
                        }
                    }
                }
                return f21416t;
            default:
                throw new UnsupportedOperationException();
        }
        return f21415s;
    }

    public Duration getActionInnervation() {
        Duration duration = this.f21422j;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public C8442b getAutomaticEvents(int i) {
        return (C8442b) this.f21421i.get(i);
    }

    public int getAutomaticEventsCount() {
        return this.f21421i.size();
    }

    public List<C8442b> getAutomaticEventsList() {
        return this.f21421i;
    }

    public int getChallengeSize() {
        return this.f21427o;
    }

    public C8454e getChallengeType() {
        C8454e a = C8454e.m19515a(this.f21426n);
        return a == null ? C8454e.UNRECOGNIZED : a;
    }

    public int getChallengeTypeValue() {
        return this.f21426n;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f21425m;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getExpireAt() {
        Timestamp timestamp = this.f21423k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getHasExpired() {
        return this.f21428p;
    }

    public Duration getNextEventTimer() {
        Duration duration = this.f21420h;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public int getNumberOfActionAvailable() {
        return this.f21419g;
    }

    public C8449b getPossibleEventTypes(int i) {
        return (C8449b) f21414r.convert(Integer.valueOf(this.f21418f.getInt(i)));
    }

    public int getPossibleEventTypesCount() {
        return this.f21418f.size();
    }

    public List<C8449b> getPossibleEventTypesList() {
        return new ListAdapter(this.f21418f, f21414r);
    }

    public int getPossibleEventTypesValue(int i) {
        return this.f21418f.getInt(i);
    }

    public List<Integer> getPossibleEventTypesValueList() {
        return this.f21418f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21418f.size(); i3++) {
            i2 += CodedOutputStream.computeEnumSizeNoTag(this.f21418f.getInt(i3));
        }
        int size = i2 + 0 + (this.f21418f.size() * 1);
        int i4 = this.f21419g;
        if (i4 != 0) {
            size += CodedOutputStream.computeInt32Size(2, i4);
        }
        if (this.f21420h != null) {
            size += CodedOutputStream.computeMessageSize(3, getNextEventTimer());
        }
        for (int i5 = 0; i5 < this.f21421i.size(); i5++) {
            size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f21421i.get(i5));
        }
        if (this.f21422j != null) {
            size += CodedOutputStream.computeMessageSize(5, getActionInnervation());
        }
        if (this.f21423k != null) {
            size += CodedOutputStream.computeMessageSize(6, getExpireAt());
        }
        int i6 = this.f21424l;
        if (i6 != 0) {
            size += CodedOutputStream.computeInt32Size(7, i6);
        }
        if (this.f21425m != null) {
            size += CodedOutputStream.computeMessageSize(8, getCreatedAt());
        }
        if (this.f21426n != C8454e.ALPHA.getNumber()) {
            size += CodedOutputStream.computeEnumSize(9, this.f21426n);
        }
        int i7 = this.f21427o;
        if (i7 != 0) {
            size += CodedOutputStream.computeInt32Size(10, i7);
        }
        boolean z = this.f21428p;
        if (z) {
            size += CodedOutputStream.computeBoolSize(11, z);
        }
        if (this.f21429q != C8445d.VERIFICATION_MODE_UNKNOWN.getNumber()) {
            size += CodedOutputStream.computeEnumSize(12, this.f21429q);
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getTriesLeft() {
        return this.f21424l;
    }

    public C8445d getVerificationMode() {
        C8445d a = C8445d.m19511a(this.f21429q);
        return a == null ? C8445d.UNRECOGNIZED : a;
    }

    public int getVerificationModeValue() {
        return this.f21429q;
    }

    public boolean hasActionInnervation() {
        return this.f21422j != null;
    }

    public boolean hasCreatedAt() {
        return this.f21425m != null;
    }

    public boolean hasExpireAt() {
        return this.f21423k != null;
    }

    public boolean hasNextEventTimer() {
        return this.f21420h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f21418f.size(); i++) {
            codedOutputStream.writeEnum(1, this.f21418f.getInt(i));
        }
        int i2 = this.f21419g;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
        if (this.f21420h != null) {
            codedOutputStream.writeMessage(3, getNextEventTimer());
        }
        for (int i3 = 0; i3 < this.f21421i.size(); i3++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f21421i.get(i3));
        }
        if (this.f21422j != null) {
            codedOutputStream.writeMessage(5, getActionInnervation());
        }
        if (this.f21423k != null) {
            codedOutputStream.writeMessage(6, getExpireAt());
        }
        int i4 = this.f21424l;
        if (i4 != 0) {
            codedOutputStream.writeInt32(7, i4);
        }
        if (this.f21425m != null) {
            codedOutputStream.writeMessage(8, getCreatedAt());
        }
        if (this.f21426n != C8454e.ALPHA.getNumber()) {
            codedOutputStream.writeEnum(9, this.f21426n);
        }
        int i5 = this.f21427o;
        if (i5 != 0) {
            codedOutputStream.writeInt32(10, i5);
        }
        boolean z = this.f21428p;
        if (z) {
            codedOutputStream.writeBool(11, z);
        }
        if (this.f21429q != C8445d.VERIFICATION_MODE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(12, this.f21429q);
        }
    }
}
