package p213co.znly.models.timetogether;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.LongList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.timetogether.C8435c.C8436a;

/* renamed from: co.znly.models.timetogether.TimeTogetherProto$Tst */
public final class TimeTogetherProto$Tst extends GeneratedMessageLite<TimeTogetherProto$Tst, C8429a> implements TimeTogetherProto$TstOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final TimeTogetherProto$Tst f21360r = new TimeTogetherProto$Tst();

    /* renamed from: s */
    private static volatile Parser<TimeTogetherProto$Tst> f21361s;

    /* renamed from: e */
    private int f21362e;

    /* renamed from: f */
    private String f21363f = "";

    /* renamed from: g */
    private int f21364g;

    /* renamed from: h */
    private boolean f21365h;

    /* renamed from: i */
    private Timestamp f21366i;

    /* renamed from: j */
    private int f21367j;

    /* renamed from: k */
    private long f21368k;

    /* renamed from: l */
    private long f21369l;

    /* renamed from: m */
    private ProtobufList<C8430b> f21370m = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: n */
    private int f21371n;

    /* renamed from: o */
    private int f21372o;

    /* renamed from: p */
    private C8435c f21373p;

    /* renamed from: q */
    private LongList f21374q = GeneratedMessageLite.emptyLongList();

    /* renamed from: co.znly.models.timetogether.TimeTogetherProto$Tst$CategoriesOrBuilder */
    public interface CategoriesOrBuilder extends MessageLiteOrBuilder {
        C8433b getCategory();

        int getCategoryValue();

        Timestamp getSince();

        boolean hasSince();
    }

    /* renamed from: co.znly.models.timetogether.TimeTogetherProto$Tst$a */
    public static final class C8429a extends Builder<TimeTogetherProto$Tst, C8429a> implements TimeTogetherProto$TstOrBuilder {
        /* synthetic */ C8429a(C8432a aVar) {
            this();
        }

        public int getBestStreak() {
            return ((TimeTogetherProto$Tst) this.instance).getBestStreak();
        }

        public C8430b getCategories(int i) {
            return ((TimeTogetherProto$Tst) this.instance).getCategories(i);
        }

        public int getCategoriesCount() {
            return ((TimeTogetherProto$Tst) this.instance).getCategoriesCount();
        }

        public List<C8430b> getCategoriesList() {
            return Collections.unmodifiableList(((TimeTogetherProto$Tst) this.instance).getCategoriesList());
        }

        public C8435c getFriendsMet() {
            return ((TimeTogetherProto$Tst) this.instance).getFriendsMet();
        }

        public int getMeetCount() {
            return ((TimeTogetherProto$Tst) this.instance).getMeetCount();
        }

        public boolean getOngoing() {
            return ((TimeTogetherProto$Tst) this.instance).getOngoing();
        }

        public int getStreak() {
            return ((TimeTogetherProto$Tst) this.instance).getStreak();
        }

        public long getTimeTogetherAllTime() {
            return ((TimeTogetherProto$Tst) this.instance).getTimeTogetherAllTime();
        }

        public long getTimeTogetherCurrentWeek() {
            return ((TimeTogetherProto$Tst) this.instance).getTimeTogetherCurrentWeek();
        }

        public C8439e getTrend() {
            return ((TimeTogetherProto$Tst) this.instance).getTrend();
        }

        public long getTrendGraph(int i) {
            return ((TimeTogetherProto$Tst) this.instance).getTrendGraph(i);
        }

        public int getTrendGraphCount() {
            return ((TimeTogetherProto$Tst) this.instance).getTrendGraphCount();
        }

        public List<Long> getTrendGraphList() {
            return Collections.unmodifiableList(((TimeTogetherProto$Tst) this.instance).getTrendGraphList());
        }

        public int getTrendValue() {
            return ((TimeTogetherProto$Tst) this.instance).getTrendValue();
        }

        public Timestamp getTs() {
            return ((TimeTogetherProto$Tst) this.instance).getTs();
        }

        public String getUserId() {
            return ((TimeTogetherProto$Tst) this.instance).getUserId();
        }

        public ByteString getUserIdBytes() {
            return ((TimeTogetherProto$Tst) this.instance).getUserIdBytes();
        }

        public boolean hasFriendsMet() {
            return ((TimeTogetherProto$Tst) this.instance).hasFriendsMet();
        }

        public boolean hasTs() {
            return ((TimeTogetherProto$Tst) this.instance).hasTs();
        }

        private C8429a() {
            super(TimeTogetherProto$Tst.f21360r);
        }
    }

    /* renamed from: co.znly.models.timetogether.TimeTogetherProto$Tst$b */
    public static final class C8430b extends GeneratedMessageLite<C8430b, C8431a> implements CategoriesOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C8430b f21375g = new C8430b();

        /* renamed from: h */
        private static volatile Parser<C8430b> f21376h;

        /* renamed from: e */
        private int f21377e;

        /* renamed from: f */
        private Timestamp f21378f;

        /* renamed from: co.znly.models.timetogether.TimeTogetherProto$Tst$b$a */
        public static final class C8431a extends Builder<C8430b, C8431a> implements CategoriesOrBuilder {
            /* synthetic */ C8431a(C8432a aVar) {
                this();
            }

            public C8433b getCategory() {
                return ((C8430b) this.instance).getCategory();
            }

            public int getCategoryValue() {
                return ((C8430b) this.instance).getCategoryValue();
            }

            public Timestamp getSince() {
                return ((C8430b) this.instance).getSince();
            }

            public boolean hasSince() {
                return ((C8430b) this.instance).hasSince();
            }

            private C8431a() {
                super(C8430b.f21375g);
            }
        }

        static {
            f21375g.makeImmutable();
        }

        private C8430b() {
        }

        public static Parser<C8430b> parser() {
            return f21375g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8432a.f21379a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C8430b();
                case 2:
                    return f21375g;
                case 3:
                    return null;
                case 4:
                    return new C8431a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C8430b bVar = (C8430b) obj2;
                    boolean z2 = this.f21377e != 0;
                    int i = this.f21377e;
                    if (bVar.f21377e != 0) {
                        z = true;
                    }
                    this.f21377e = visitor.visitInt(z2, i, z, bVar.f21377e);
                    this.f21378f = (Timestamp) visitor.visitMessage(this.f21378f, bVar.f21378f);
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
                                    this.f21377e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f21378f != null ? (Timestamp.Builder) this.f21378f.toBuilder() : null;
                                    this.f21378f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f21378f);
                                        this.f21378f = (Timestamp) builder.buildPartial();
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
                    if (f21376h == null) {
                        synchronized (C8430b.class) {
                            if (f21376h == null) {
                                f21376h = new DefaultInstanceBasedParser(f21375g);
                            }
                        }
                    }
                    return f21376h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f21375g;
        }

        public C8433b getCategory() {
            C8433b a = C8433b.m19506a(this.f21377e);
            return a == null ? C8433b.UNRECOGNIZED : a;
        }

        public int getCategoryValue() {
            return this.f21377e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f21377e != C8433b.UNKNOWN_CATEGORY.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f21377e);
            }
            if (this.f21378f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getSince());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Timestamp getSince() {
            Timestamp timestamp = this.f21378f;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasSince() {
            return this.f21378f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f21377e != C8433b.UNKNOWN_CATEGORY.getNumber()) {
                codedOutputStream.writeEnum(1, this.f21377e);
            }
            if (this.f21378f != null) {
                codedOutputStream.writeMessage(2, getSince());
            }
        }
    }

    static {
        f21360r.makeImmutable();
    }

    private TimeTogetherProto$Tst() {
    }

    public static C8429a newBuilder() {
        return (C8429a) f21360r.toBuilder();
    }

    public static Parser<TimeTogetherProto$Tst> parser() {
        return f21360r.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8432a.f21379a[methodToInvoke.ordinal()]) {
            case 1:
                return new TimeTogetherProto$Tst();
            case 2:
                return f21360r;
            case 3:
                this.f21370m.makeImmutable();
                this.f21374q.makeImmutable();
                return null;
            case 4:
                return new C8429a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                TimeTogetherProto$Tst timeTogetherProto$Tst = (TimeTogetherProto$Tst) obj2;
                this.f21363f = visitor.visitString(!this.f21363f.isEmpty(), this.f21363f, !timeTogetherProto$Tst.f21363f.isEmpty(), timeTogetherProto$Tst.f21363f);
                this.f21364g = visitor.visitInt(this.f21364g != 0, this.f21364g, timeTogetherProto$Tst.f21364g != 0, timeTogetherProto$Tst.f21364g);
                boolean z2 = this.f21365h;
                boolean z3 = timeTogetherProto$Tst.f21365h;
                this.f21365h = visitor.visitBoolean(z2, z2, z3, z3);
                this.f21366i = (Timestamp) visitor.visitMessage(this.f21366i, timeTogetherProto$Tst.f21366i);
                this.f21367j = visitor.visitInt(this.f21367j != 0, this.f21367j, timeTogetherProto$Tst.f21367j != 0, timeTogetherProto$Tst.f21367j);
                this.f21368k = visitor.visitLong(this.f21368k != 0, this.f21368k, timeTogetherProto$Tst.f21368k != 0, timeTogetherProto$Tst.f21368k);
                this.f21369l = visitor.visitLong(this.f21369l != 0, this.f21369l, timeTogetherProto$Tst.f21369l != 0, timeTogetherProto$Tst.f21369l);
                this.f21370m = visitor.visitList(this.f21370m, timeTogetherProto$Tst.f21370m);
                this.f21371n = visitor.visitInt(this.f21371n != 0, this.f21371n, timeTogetherProto$Tst.f21371n != 0, timeTogetherProto$Tst.f21371n);
                boolean z4 = this.f21372o != 0;
                int i = this.f21372o;
                if (timeTogetherProto$Tst.f21372o != 0) {
                    z = true;
                }
                this.f21372o = visitor.visitInt(z4, i, z, timeTogetherProto$Tst.f21372o);
                this.f21373p = (C8435c) visitor.visitMessage(this.f21373p, timeTogetherProto$Tst.f21373p);
                this.f21374q = visitor.visitLongList(this.f21374q, timeTogetherProto$Tst.f21374q);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21362e |= timeTogetherProto$Tst.f21362e;
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
                            case 10:
                                this.f21363f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 16:
                                this.f21364g = codedInputStream.readInt32();
                                break;
                            case 24:
                                this.f21365h = codedInputStream.readBool();
                                break;
                            case 42:
                                Builder builder = this.f21366i != null ? (Timestamp.Builder) this.f21366i.toBuilder() : null;
                                this.f21366i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f21366i);
                                    this.f21366i = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 48:
                                this.f21367j = codedInputStream.readEnum();
                                break;
                            case 56:
                                this.f21368k = codedInputStream.readInt64();
                                break;
                            case 64:
                                this.f21369l = codedInputStream.readInt64();
                                break;
                            case 74:
                                if (!this.f21370m.isModifiable()) {
                                    this.f21370m = GeneratedMessageLite.mutableCopy(this.f21370m);
                                }
                                this.f21370m.add(codedInputStream.readMessage(C8430b.parser(), extensionRegistryLite));
                                break;
                            case 80:
                                this.f21371n = codedInputStream.readInt32();
                                break;
                            case 88:
                                this.f21372o = codedInputStream.readInt32();
                                break;
                            case 98:
                                Builder builder2 = this.f21373p != null ? (C8436a) this.f21373p.toBuilder() : null;
                                this.f21373p = (C8435c) codedInputStream.readMessage(C8435c.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f21373p);
                                    this.f21373p = (C8435c) builder2.buildPartial();
                                    break;
                                }
                            case 104:
                                if (!this.f21374q.isModifiable()) {
                                    this.f21374q = GeneratedMessageLite.mutableCopy(this.f21374q);
                                }
                                this.f21374q.addLong(codedInputStream.readInt64());
                                break;
                            case 106:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.f21374q.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f21374q = GeneratedMessageLite.mutableCopy(this.f21374q);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f21374q.addLong(codedInputStream.readInt64());
                                }
                                codedInputStream.popLimit(pushLimit);
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
                if (f21361s == null) {
                    synchronized (TimeTogetherProto$Tst.class) {
                        if (f21361s == null) {
                            f21361s = new DefaultInstanceBasedParser(f21360r);
                        }
                    }
                }
                return f21361s;
            default:
                throw new UnsupportedOperationException();
        }
        return f21360r;
    }

    public int getBestStreak() {
        return this.f21371n;
    }

    public C8430b getCategories(int i) {
        return (C8430b) this.f21370m.get(i);
    }

    public int getCategoriesCount() {
        return this.f21370m.size();
    }

    public List<C8430b> getCategoriesList() {
        return this.f21370m;
    }

    public C8435c getFriendsMet() {
        C8435c cVar = this.f21373p;
        return cVar == null ? C8435c.getDefaultInstance() : cVar;
    }

    public int getMeetCount() {
        return this.f21372o;
    }

    public boolean getOngoing() {
        return this.f21365h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f21363f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUserId()) + 0 : 0;
        int i2 = this.f21364g;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(2, i2);
        }
        boolean z = this.f21365h;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(3, z);
        }
        if (this.f21366i != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, getTs());
        }
        if (this.f21367j != C8439e.UNKNOWN_TREND.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(6, this.f21367j);
        }
        long j = this.f21368k;
        if (j != 0) {
            computeStringSize += CodedOutputStream.computeInt64Size(7, j);
        }
        long j2 = this.f21369l;
        if (j2 != 0) {
            computeStringSize += CodedOutputStream.computeInt64Size(8, j2);
        }
        int i3 = computeStringSize;
        for (int i4 = 0; i4 < this.f21370m.size(); i4++) {
            i3 += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f21370m.get(i4));
        }
        int i5 = this.f21371n;
        if (i5 != 0) {
            i3 += CodedOutputStream.computeInt32Size(10, i5);
        }
        int i6 = this.f21372o;
        if (i6 != 0) {
            i3 += CodedOutputStream.computeInt32Size(11, i6);
        }
        if (this.f21373p != null) {
            i3 += CodedOutputStream.computeMessageSize(12, getFriendsMet());
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f21374q.size(); i8++) {
            i7 += CodedOutputStream.computeInt64SizeNoTag(this.f21374q.getLong(i8));
        }
        int size = i3 + i7 + (getTrendGraphList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getStreak() {
        return this.f21364g;
    }

    public long getTimeTogetherAllTime() {
        return this.f21369l;
    }

    public long getTimeTogetherCurrentWeek() {
        return this.f21368k;
    }

    public C8439e getTrend() {
        C8439e a = C8439e.m19508a(this.f21367j);
        return a == null ? C8439e.UNRECOGNIZED : a;
    }

    public long getTrendGraph(int i) {
        return this.f21374q.getLong(i);
    }

    public int getTrendGraphCount() {
        return this.f21374q.size();
    }

    public List<Long> getTrendGraphList() {
        return this.f21374q;
    }

    public int getTrendValue() {
        return this.f21367j;
    }

    public Timestamp getTs() {
        Timestamp timestamp = this.f21366i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUserId() {
        return this.f21363f;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.f21363f);
    }

    public boolean hasFriendsMet() {
        return this.f21373p != null;
    }

    public boolean hasTs() {
        return this.f21366i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (!this.f21363f.isEmpty()) {
            codedOutputStream.writeString(1, getUserId());
        }
        int i = this.f21364g;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        boolean z = this.f21365h;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        if (this.f21366i != null) {
            codedOutputStream.writeMessage(5, getTs());
        }
        if (this.f21367j != C8439e.UNKNOWN_TREND.getNumber()) {
            codedOutputStream.writeEnum(6, this.f21367j);
        }
        long j = this.f21368k;
        if (j != 0) {
            codedOutputStream.writeInt64(7, j);
        }
        long j2 = this.f21369l;
        if (j2 != 0) {
            codedOutputStream.writeInt64(8, j2);
        }
        for (int i2 = 0; i2 < this.f21370m.size(); i2++) {
            codedOutputStream.writeMessage(9, (MessageLite) this.f21370m.get(i2));
        }
        int i3 = this.f21371n;
        if (i3 != 0) {
            codedOutputStream.writeInt32(10, i3);
        }
        int i4 = this.f21372o;
        if (i4 != 0) {
            codedOutputStream.writeInt32(11, i4);
        }
        if (this.f21373p != null) {
            codedOutputStream.writeMessage(12, getFriendsMet());
        }
        for (int i5 = 0; i5 < this.f21374q.size(); i5++) {
            codedOutputStream.writeInt64(13, this.f21374q.getLong(i5));
        }
    }
}
