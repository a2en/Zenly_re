package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MapEntryLite;
import p213co.znly.core.vendor.com.google.protobuf.MapFieldLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;

/* renamed from: co.znly.models.PlaceProto$LeavingTimes */
public final class PlaceProto$LeavingTimes extends GeneratedMessageLite<PlaceProto$LeavingTimes, C6828a> implements PlaceProto$LeavingTimesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final PlaceProto$LeavingTimes f16648j = new PlaceProto$LeavingTimes();

    /* renamed from: k */
    private static volatile Parser<PlaceProto$LeavingTimes> f16649k;

    /* renamed from: e */
    private int f16650e;

    /* renamed from: f */
    private int f16651f;

    /* renamed from: g */
    private MapFieldLite<Integer, C6835f> f16652g = MapFieldLite.emptyMapField();

    /* renamed from: h */
    private MapFieldLite<Integer, C6832e> f16653h = MapFieldLite.emptyMapField();

    /* renamed from: i */
    private MapFieldLite<Integer, C6838g> f16654i = MapFieldLite.emptyMapField();

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$DictTimesEntranceLeavingOrBuilder */
    public interface DictTimesEntranceLeavingOrBuilder extends MessageLiteOrBuilder {
        boolean containsDictTimesInOut(int i);

        @Deprecated
        Map<Integer, C6838g> getDictTimesInOut();

        int getDictTimesInOutCount();

        Map<Integer, C6838g> getDictTimesInOutMap();

        C6838g getDictTimesInOutOrDefault(int i, C6838g gVar);

        C6838g getDictTimesInOutOrThrow(int i);
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$DictTimesInsideOutsideOrBuilder */
    public interface DictTimesInsideOutsideOrBuilder extends MessageLiteOrBuilder {
        boolean containsDictTimes(int i);

        @Deprecated
        Map<Integer, C6840h> getDictTimes();

        int getDictTimesCount();

        Map<Integer, C6840h> getDictTimesMap();

        C6840h getDictTimesOrDefault(int i, C6840h hVar);

        C6840h getDictTimesOrThrow(int i);
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$ListDurationsOrBuilder */
    public interface ListDurationsOrBuilder extends MessageLiteOrBuilder {
        Duration getSecondsFromMidnights(int i);

        int getSecondsFromMidnightsCount();

        List<Duration> getSecondsFromMidnightsList();
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$PairDurationsSinceMidnightListOrBuilder */
    public interface PairDurationsSinceMidnightListOrBuilder extends MessageLiteOrBuilder {
        C6958b2 getDurations(int i);

        int getDurationsCount();

        List<C6958b2> getDurationsList();
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$a */
    public static final class C6828a extends Builder<PlaceProto$LeavingTimes, C6828a> implements PlaceProto$LeavingTimesOrBuilder {
        /* synthetic */ C6828a(C6946a2 a2Var) {
            this();
        }

        public boolean containsDictDaysInOut(int i) {
            return ((PlaceProto$LeavingTimes) this.instance).getDictDaysInOutMap().containsKey(Integer.valueOf(i));
        }

        public boolean containsDictDaysTimes(int i) {
            return ((PlaceProto$LeavingTimes) this.instance).getDictDaysTimesMap().containsKey(Integer.valueOf(i));
        }

        public boolean containsDictTimeInOut(int i) {
            return ((PlaceProto$LeavingTimes) this.instance).getDictTimeInOutMap().containsKey(Integer.valueOf(i));
        }

        @Deprecated
        public Map<Integer, C6835f> getDictDaysInOut() {
            return getDictDaysInOutMap();
        }

        public int getDictDaysInOutCount() {
            return ((PlaceProto$LeavingTimes) this.instance).getDictDaysInOutMap().size();
        }

        public Map<Integer, C6835f> getDictDaysInOutMap() {
            return Collections.unmodifiableMap(((PlaceProto$LeavingTimes) this.instance).getDictDaysInOutMap());
        }

        public C6835f getDictDaysInOutOrDefault(int i, C6835f fVar) {
            Map dictDaysInOutMap = ((PlaceProto$LeavingTimes) this.instance).getDictDaysInOutMap();
            return dictDaysInOutMap.containsKey(Integer.valueOf(i)) ? (C6835f) dictDaysInOutMap.get(Integer.valueOf(i)) : fVar;
        }

        public C6835f getDictDaysInOutOrThrow(int i) {
            Map dictDaysInOutMap = ((PlaceProto$LeavingTimes) this.instance).getDictDaysInOutMap();
            if (dictDaysInOutMap.containsKey(Integer.valueOf(i))) {
                return (C6835f) dictDaysInOutMap.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<Integer, C6832e> getDictDaysTimes() {
            return getDictDaysTimesMap();
        }

        public int getDictDaysTimesCount() {
            return ((PlaceProto$LeavingTimes) this.instance).getDictDaysTimesMap().size();
        }

        public Map<Integer, C6832e> getDictDaysTimesMap() {
            return Collections.unmodifiableMap(((PlaceProto$LeavingTimes) this.instance).getDictDaysTimesMap());
        }

        public C6832e getDictDaysTimesOrDefault(int i, C6832e eVar) {
            Map dictDaysTimesMap = ((PlaceProto$LeavingTimes) this.instance).getDictDaysTimesMap();
            return dictDaysTimesMap.containsKey(Integer.valueOf(i)) ? (C6832e) dictDaysTimesMap.get(Integer.valueOf(i)) : eVar;
        }

        public C6832e getDictDaysTimesOrThrow(int i) {
            Map dictDaysTimesMap = ((PlaceProto$LeavingTimes) this.instance).getDictDaysTimesMap();
            if (dictDaysTimesMap.containsKey(Integer.valueOf(i))) {
                return (C6832e) dictDaysTimesMap.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<Integer, C6838g> getDictTimeInOut() {
            return getDictTimeInOutMap();
        }

        public int getDictTimeInOutCount() {
            return ((PlaceProto$LeavingTimes) this.instance).getDictTimeInOutMap().size();
        }

        public Map<Integer, C6838g> getDictTimeInOutMap() {
            return Collections.unmodifiableMap(((PlaceProto$LeavingTimes) this.instance).getDictTimeInOutMap());
        }

        public C6838g getDictTimeInOutOrDefault(int i, C6838g gVar) {
            Map dictTimeInOutMap = ((PlaceProto$LeavingTimes) this.instance).getDictTimeInOutMap();
            return dictTimeInOutMap.containsKey(Integer.valueOf(i)) ? (C6838g) dictTimeInOutMap.get(Integer.valueOf(i)) : gVar;
        }

        public C6838g getDictTimeInOutOrThrow(int i) {
            Map dictTimeInOutMap = ((PlaceProto$LeavingTimes) this.instance).getDictTimeInOutMap();
            if (dictTimeInOutMap.containsKey(Integer.valueOf(i))) {
                return (C6838g) dictTimeInOutMap.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        public int getPlaceId() {
            return ((PlaceProto$LeavingTimes) this.instance).getPlaceId();
        }

        private C6828a() {
            super(PlaceProto$LeavingTimes.f16648j);
        }
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$b */
    private static final class C6829b {

        /* renamed from: a */
        static final MapEntryLite<Integer, C6835f> f16655a = MapEntryLite.newDefaultInstance(FieldType.UINT32, Integer.valueOf(0), FieldType.MESSAGE, C6835f.getDefaultInstance());
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$c */
    private static final class C6830c {

        /* renamed from: a */
        static final MapEntryLite<Integer, C6832e> f16656a = MapEntryLite.newDefaultInstance(FieldType.UINT32, Integer.valueOf(0), FieldType.MESSAGE, C6832e.getDefaultInstance());
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$d */
    private static final class C6831d {

        /* renamed from: a */
        static final MapEntryLite<Integer, C6838g> f16657a = MapEntryLite.newDefaultInstance(FieldType.UINT32, Integer.valueOf(0), FieldType.MESSAGE, C6838g.getDefaultInstance());
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$e */
    public static final class C6832e extends GeneratedMessageLite<C6832e, C6833a> implements DictTimesEntranceLeavingOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6832e f16658f = new C6832e();

        /* renamed from: g */
        private static volatile Parser<C6832e> f16659g;

        /* renamed from: e */
        private MapFieldLite<Integer, C6838g> f16660e = MapFieldLite.emptyMapField();

        /* renamed from: co.znly.models.PlaceProto$LeavingTimes$e$a */
        public static final class C6833a extends Builder<C6832e, C6833a> implements DictTimesEntranceLeavingOrBuilder {
            /* synthetic */ C6833a(C6946a2 a2Var) {
                this();
            }

            public boolean containsDictTimesInOut(int i) {
                return ((C6832e) this.instance).getDictTimesInOutMap().containsKey(Integer.valueOf(i));
            }

            @Deprecated
            public Map<Integer, C6838g> getDictTimesInOut() {
                return getDictTimesInOutMap();
            }

            public int getDictTimesInOutCount() {
                return ((C6832e) this.instance).getDictTimesInOutMap().size();
            }

            public Map<Integer, C6838g> getDictTimesInOutMap() {
                return Collections.unmodifiableMap(((C6832e) this.instance).getDictTimesInOutMap());
            }

            public C6838g getDictTimesInOutOrDefault(int i, C6838g gVar) {
                Map dictTimesInOutMap = ((C6832e) this.instance).getDictTimesInOutMap();
                return dictTimesInOutMap.containsKey(Integer.valueOf(i)) ? (C6838g) dictTimesInOutMap.get(Integer.valueOf(i)) : gVar;
            }

            public C6838g getDictTimesInOutOrThrow(int i) {
                Map dictTimesInOutMap = ((C6832e) this.instance).getDictTimesInOutMap();
                if (dictTimesInOutMap.containsKey(Integer.valueOf(i))) {
                    return (C6838g) dictTimesInOutMap.get(Integer.valueOf(i));
                }
                throw new IllegalArgumentException();
            }

            private C6833a() {
                super(C6832e.f16658f);
            }
        }

        /* renamed from: co.znly.models.PlaceProto$LeavingTimes$e$b */
        private static final class C6834b {

            /* renamed from: a */
            static final MapEntryLite<Integer, C6838g> f16661a = MapEntryLite.newDefaultInstance(FieldType.UINT32, Integer.valueOf(0), FieldType.MESSAGE, C6838g.getDefaultInstance());
        }

        static {
            f16658f.makeImmutable();
        }

        private C6832e() {
        }

        /* renamed from: b */
        private MapFieldLite<Integer, C6838g> m17588b() {
            return this.f16660e;
        }

        public static C6832e getDefaultInstance() {
            return f16658f;
        }

        public boolean containsDictTimesInOut(int i) {
            return m17588b().containsKey(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6832e();
                case 2:
                    return f16658f;
                case 3:
                    this.f16660e.makeImmutable();
                    return null;
                case 4:
                    return new C6833a(null);
                case 5:
                    this.f16660e = ((Visitor) obj).visitMap(this.f16660e, ((C6832e) obj2).m17588b());
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
                                    if (!this.f16660e.isMutable()) {
                                        this.f16660e = this.f16660e.mutableCopy();
                                    }
                                    C6834b.f16661a.parseInto(this.f16660e, codedInputStream, extensionRegistryLite);
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
                    if (f16659g == null) {
                        synchronized (C6832e.class) {
                            if (f16659g == null) {
                                f16659g = new DefaultInstanceBasedParser(f16658f);
                            }
                        }
                    }
                    return f16659g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16658f;
        }

        @Deprecated
        public Map<Integer, C6838g> getDictTimesInOut() {
            return getDictTimesInOutMap();
        }

        public int getDictTimesInOutCount() {
            return m17588b().size();
        }

        public Map<Integer, C6838g> getDictTimesInOutMap() {
            return Collections.unmodifiableMap(m17588b());
        }

        public C6838g getDictTimesInOutOrDefault(int i, C6838g gVar) {
            MapFieldLite b = m17588b();
            return b.containsKey(Integer.valueOf(i)) ? (C6838g) b.get(Integer.valueOf(i)) : gVar;
        }

        public C6838g getDictTimesInOutOrThrow(int i) {
            MapFieldLite b = m17588b();
            if (b.containsKey(Integer.valueOf(i))) {
                return (C6838g) b.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (Entry entry : m17588b().entrySet()) {
                i2 += C6834b.f16661a.computeMessageSize(1, entry.getKey(), entry.getValue());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (Entry entry : m17588b().entrySet()) {
                C6834b.f16661a.serializeTo(codedOutputStream, 1, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$f */
    public static final class C6835f extends GeneratedMessageLite<C6835f, C6836a> implements DictTimesInsideOutsideOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6835f f16662f = new C6835f();

        /* renamed from: g */
        private static volatile Parser<C6835f> f16663g;

        /* renamed from: e */
        private MapFieldLite<Integer, C6840h> f16664e = MapFieldLite.emptyMapField();

        /* renamed from: co.znly.models.PlaceProto$LeavingTimes$f$a */
        public static final class C6836a extends Builder<C6835f, C6836a> implements DictTimesInsideOutsideOrBuilder {
            /* synthetic */ C6836a(C6946a2 a2Var) {
                this();
            }

            public boolean containsDictTimes(int i) {
                return ((C6835f) this.instance).getDictTimesMap().containsKey(Integer.valueOf(i));
            }

            @Deprecated
            public Map<Integer, C6840h> getDictTimes() {
                return getDictTimesMap();
            }

            public int getDictTimesCount() {
                return ((C6835f) this.instance).getDictTimesMap().size();
            }

            public Map<Integer, C6840h> getDictTimesMap() {
                return Collections.unmodifiableMap(((C6835f) this.instance).getDictTimesMap());
            }

            public C6840h getDictTimesOrDefault(int i, C6840h hVar) {
                Map dictTimesMap = ((C6835f) this.instance).getDictTimesMap();
                return dictTimesMap.containsKey(Integer.valueOf(i)) ? (C6840h) dictTimesMap.get(Integer.valueOf(i)) : hVar;
            }

            public C6840h getDictTimesOrThrow(int i) {
                Map dictTimesMap = ((C6835f) this.instance).getDictTimesMap();
                if (dictTimesMap.containsKey(Integer.valueOf(i))) {
                    return (C6840h) dictTimesMap.get(Integer.valueOf(i));
                }
                throw new IllegalArgumentException();
            }

            private C6836a() {
                super(C6835f.f16662f);
            }
        }

        /* renamed from: co.znly.models.PlaceProto$LeavingTimes$f$b */
        private static final class C6837b {

            /* renamed from: a */
            static final MapEntryLite<Integer, C6840h> f16665a = MapEntryLite.newDefaultInstance(FieldType.UINT32, Integer.valueOf(0), FieldType.MESSAGE, C6840h.getDefaultInstance());
        }

        static {
            f16662f.makeImmutable();
        }

        private C6835f() {
        }

        /* renamed from: b */
        private MapFieldLite<Integer, C6840h> m17590b() {
            return this.f16664e;
        }

        public static C6835f getDefaultInstance() {
            return f16662f;
        }

        public boolean containsDictTimes(int i) {
            return m17590b().containsKey(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6835f();
                case 2:
                    return f16662f;
                case 3:
                    this.f16664e.makeImmutable();
                    return null;
                case 4:
                    return new C6836a(null);
                case 5:
                    this.f16664e = ((Visitor) obj).visitMap(this.f16664e, ((C6835f) obj2).m17590b());
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
                                    if (!this.f16664e.isMutable()) {
                                        this.f16664e = this.f16664e.mutableCopy();
                                    }
                                    C6837b.f16665a.parseInto(this.f16664e, codedInputStream, extensionRegistryLite);
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
                    if (f16663g == null) {
                        synchronized (C6835f.class) {
                            if (f16663g == null) {
                                f16663g = new DefaultInstanceBasedParser(f16662f);
                            }
                        }
                    }
                    return f16663g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16662f;
        }

        @Deprecated
        public Map<Integer, C6840h> getDictTimes() {
            return getDictTimesMap();
        }

        public int getDictTimesCount() {
            return m17590b().size();
        }

        public Map<Integer, C6840h> getDictTimesMap() {
            return Collections.unmodifiableMap(m17590b());
        }

        public C6840h getDictTimesOrDefault(int i, C6840h hVar) {
            MapFieldLite b = m17590b();
            return b.containsKey(Integer.valueOf(i)) ? (C6840h) b.get(Integer.valueOf(i)) : hVar;
        }

        public C6840h getDictTimesOrThrow(int i) {
            MapFieldLite b = m17590b();
            if (b.containsKey(Integer.valueOf(i))) {
                return (C6840h) b.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (Entry entry : m17590b().entrySet()) {
                i2 += C6837b.f16665a.computeMessageSize(1, entry.getKey(), entry.getValue());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (Entry entry : m17590b().entrySet()) {
                C6837b.f16665a.serializeTo(codedOutputStream, 1, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$g */
    public static final class C6838g extends GeneratedMessageLite<C6838g, C6839a> implements ListDurationsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6838g f16666f = new C6838g();

        /* renamed from: g */
        private static volatile Parser<C6838g> f16667g;

        /* renamed from: e */
        private ProtobufList<Duration> f16668e = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.models.PlaceProto$LeavingTimes$g$a */
        public static final class C6839a extends Builder<C6838g, C6839a> implements ListDurationsOrBuilder {
            /* synthetic */ C6839a(C6946a2 a2Var) {
                this();
            }

            public Duration getSecondsFromMidnights(int i) {
                return ((C6838g) this.instance).getSecondsFromMidnights(i);
            }

            public int getSecondsFromMidnightsCount() {
                return ((C6838g) this.instance).getSecondsFromMidnightsCount();
            }

            public List<Duration> getSecondsFromMidnightsList() {
                return Collections.unmodifiableList(((C6838g) this.instance).getSecondsFromMidnightsList());
            }

            private C6839a() {
                super(C6838g.f16666f);
            }
        }

        static {
            f16666f.makeImmutable();
        }

        private C6838g() {
        }

        public static C6838g getDefaultInstance() {
            return f16666f;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6838g();
                case 2:
                    return f16666f;
                case 3:
                    this.f16668e.makeImmutable();
                    return null;
                case 4:
                    return new C6839a(null);
                case 5:
                    this.f16668e = ((Visitor) obj).visitList(this.f16668e, ((C6838g) obj2).f16668e);
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
                                    if (!this.f16668e.isModifiable()) {
                                        this.f16668e = GeneratedMessageLite.mutableCopy(this.f16668e);
                                    }
                                    this.f16668e.add(codedInputStream.readMessage(Duration.parser(), extensionRegistryLite));
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
                    if (f16667g == null) {
                        synchronized (C6838g.class) {
                            if (f16667g == null) {
                                f16667g = new DefaultInstanceBasedParser(f16666f);
                            }
                        }
                    }
                    return f16667g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16666f;
        }

        public Duration getSecondsFromMidnights(int i) {
            return (Duration) this.f16668e.get(i);
        }

        public int getSecondsFromMidnightsCount() {
            return this.f16668e.size();
        }

        public List<Duration> getSecondsFromMidnightsList() {
            return this.f16668e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f16668e.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f16668e.get(i3));
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f16668e.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f16668e.get(i));
            }
        }
    }

    /* renamed from: co.znly.models.PlaceProto$LeavingTimes$h */
    public static final class C6840h extends GeneratedMessageLite<C6840h, C6841a> implements PairDurationsSinceMidnightListOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6840h f16669f = new C6840h();

        /* renamed from: g */
        private static volatile Parser<C6840h> f16670g;

        /* renamed from: e */
        private ProtobufList<C6958b2> f16671e = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.models.PlaceProto$LeavingTimes$h$a */
        public static final class C6841a extends Builder<C6840h, C6841a> implements PairDurationsSinceMidnightListOrBuilder {
            /* synthetic */ C6841a(C6946a2 a2Var) {
                this();
            }

            public C6958b2 getDurations(int i) {
                return ((C6840h) this.instance).getDurations(i);
            }

            public int getDurationsCount() {
                return ((C6840h) this.instance).getDurationsCount();
            }

            public List<C6958b2> getDurationsList() {
                return Collections.unmodifiableList(((C6840h) this.instance).getDurationsList());
            }

            private C6841a() {
                super(C6840h.f16669f);
            }
        }

        static {
            f16669f.makeImmutable();
        }

        private C6840h() {
        }

        public static C6840h getDefaultInstance() {
            return f16669f;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6840h();
                case 2:
                    return f16669f;
                case 3:
                    this.f16671e.makeImmutable();
                    return null;
                case 4:
                    return new C6841a(null);
                case 5:
                    this.f16671e = ((Visitor) obj).visitList(this.f16671e, ((C6840h) obj2).f16671e);
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
                                    if (!this.f16671e.isModifiable()) {
                                        this.f16671e = GeneratedMessageLite.mutableCopy(this.f16671e);
                                    }
                                    this.f16671e.add(codedInputStream.readMessage(C6958b2.parser(), extensionRegistryLite));
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
                    if (f16670g == null) {
                        synchronized (C6840h.class) {
                            if (f16670g == null) {
                                f16670g = new DefaultInstanceBasedParser(f16669f);
                            }
                        }
                    }
                    return f16670g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16669f;
        }

        public C6958b2 getDurations(int i) {
            return (C6958b2) this.f16671e.get(i);
        }

        public int getDurationsCount() {
            return this.f16671e.size();
        }

        public List<C6958b2> getDurationsList() {
            return this.f16671e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f16671e.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f16671e.get(i3));
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f16671e.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f16671e.get(i));
            }
        }
    }

    static {
        f16648j.makeImmutable();
    }

    private PlaceProto$LeavingTimes() {
    }

    /* renamed from: b */
    private MapFieldLite<Integer, C6835f> m17584b() {
        return this.f16652g;
    }

    /* renamed from: c */
    private MapFieldLite<Integer, C6832e> m17585c() {
        return this.f16653h;
    }

    /* renamed from: d */
    private MapFieldLite<Integer, C6838g> m17586d() {
        return this.f16654i;
    }

    public boolean containsDictDaysInOut(int i) {
        return m17584b().containsKey(Integer.valueOf(i));
    }

    public boolean containsDictDaysTimes(int i) {
        return m17585c().containsKey(Integer.valueOf(i));
    }

    public boolean containsDictTimeInOut(int i) {
        return m17586d().containsKey(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaceProto$LeavingTimes();
            case 2:
                return f16648j;
            case 3:
                this.f16652g.makeImmutable();
                this.f16653h.makeImmutable();
                this.f16654i.makeImmutable();
                return null;
            case 4:
                return new C6828a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PlaceProto$LeavingTimes placeProto$LeavingTimes = (PlaceProto$LeavingTimes) obj2;
                boolean z2 = this.f16651f != 0;
                int i = this.f16651f;
                if (placeProto$LeavingTimes.f16651f != 0) {
                    z = true;
                }
                this.f16651f = visitor.visitInt(z2, i, z, placeProto$LeavingTimes.f16651f);
                this.f16652g = visitor.visitMap(this.f16652g, placeProto$LeavingTimes.m17584b());
                this.f16653h = visitor.visitMap(this.f16653h, placeProto$LeavingTimes.m17585c());
                this.f16654i = visitor.visitMap(this.f16654i, placeProto$LeavingTimes.m17586d());
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16650e |= placeProto$LeavingTimes.f16650e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f16651f = codedInputStream.readUInt32();
                            } else if (readTag == 18) {
                                if (!this.f16652g.isMutable()) {
                                    this.f16652g = this.f16652g.mutableCopy();
                                }
                                C6829b.f16655a.parseInto(this.f16652g, codedInputStream, extensionRegistryLite);
                            } else if (readTag == 26) {
                                if (!this.f16653h.isMutable()) {
                                    this.f16653h = this.f16653h.mutableCopy();
                                }
                                C6830c.f16656a.parseInto(this.f16653h, codedInputStream, extensionRegistryLite);
                            } else if (readTag == 34) {
                                if (!this.f16654i.isMutable()) {
                                    this.f16654i = this.f16654i.mutableCopy();
                                }
                                C6831d.f16657a.parseInto(this.f16654i, codedInputStream, extensionRegistryLite);
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
                if (f16649k == null) {
                    synchronized (PlaceProto$LeavingTimes.class) {
                        if (f16649k == null) {
                            f16649k = new DefaultInstanceBasedParser(f16648j);
                        }
                    }
                }
                return f16649k;
            default:
                throw new UnsupportedOperationException();
        }
        return f16648j;
    }

    @Deprecated
    public Map<Integer, C6835f> getDictDaysInOut() {
        return getDictDaysInOutMap();
    }

    public int getDictDaysInOutCount() {
        return m17584b().size();
    }

    public Map<Integer, C6835f> getDictDaysInOutMap() {
        return Collections.unmodifiableMap(m17584b());
    }

    public C6835f getDictDaysInOutOrDefault(int i, C6835f fVar) {
        MapFieldLite b = m17584b();
        return b.containsKey(Integer.valueOf(i)) ? (C6835f) b.get(Integer.valueOf(i)) : fVar;
    }

    public C6835f getDictDaysInOutOrThrow(int i) {
        MapFieldLite b = m17584b();
        if (b.containsKey(Integer.valueOf(i))) {
            return (C6835f) b.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<Integer, C6832e> getDictDaysTimes() {
        return getDictDaysTimesMap();
    }

    public int getDictDaysTimesCount() {
        return m17585c().size();
    }

    public Map<Integer, C6832e> getDictDaysTimesMap() {
        return Collections.unmodifiableMap(m17585c());
    }

    public C6832e getDictDaysTimesOrDefault(int i, C6832e eVar) {
        MapFieldLite c = m17585c();
        return c.containsKey(Integer.valueOf(i)) ? (C6832e) c.get(Integer.valueOf(i)) : eVar;
    }

    public C6832e getDictDaysTimesOrThrow(int i) {
        MapFieldLite c = m17585c();
        if (c.containsKey(Integer.valueOf(i))) {
            return (C6832e) c.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<Integer, C6838g> getDictTimeInOut() {
        return getDictTimeInOutMap();
    }

    public int getDictTimeInOutCount() {
        return m17586d().size();
    }

    public Map<Integer, C6838g> getDictTimeInOutMap() {
        return Collections.unmodifiableMap(m17586d());
    }

    public C6838g getDictTimeInOutOrDefault(int i, C6838g gVar) {
        MapFieldLite d = m17586d();
        return d.containsKey(Integer.valueOf(i)) ? (C6838g) d.get(Integer.valueOf(i)) : gVar;
    }

    public C6838g getDictTimeInOutOrThrow(int i) {
        MapFieldLite d = m17586d();
        if (d.containsKey(Integer.valueOf(i))) {
            return (C6838g) d.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public int getPlaceId() {
        return this.f16651f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f16651f;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeUInt32Size(1, i3);
        }
        for (Entry entry : m17584b().entrySet()) {
            i2 += C6829b.f16655a.computeMessageSize(2, entry.getKey(), entry.getValue());
        }
        for (Entry entry2 : m17585c().entrySet()) {
            i2 += C6830c.f16656a.computeMessageSize(3, entry2.getKey(), entry2.getValue());
        }
        for (Entry entry3 : m17586d().entrySet()) {
            i2 += C6831d.f16657a.computeMessageSize(4, entry3.getKey(), entry3.getValue());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f16651f;
        if (i != 0) {
            codedOutputStream.writeUInt32(1, i);
        }
        for (Entry entry : m17584b().entrySet()) {
            C6829b.f16655a.serializeTo(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        for (Entry entry2 : m17585c().entrySet()) {
            C6830c.f16656a.serializeTo(codedOutputStream, 3, entry2.getKey(), entry2.getValue());
        }
        for (Entry entry3 : m17586d().entrySet()) {
            C6831d.f16657a.serializeTo(codedOutputStream, 4, entry3.getKey(), entry3.getValue());
        }
    }
}
