package p213co.znly.models.places;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter.Converter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.C7297f0;
import p213co.znly.models.C7297f0.C7298a;
import p213co.znly.models.places.C7871b.C7872a;

/* renamed from: co.znly.models.places.PlaceProto$PlaceData */
public final class PlaceProto$PlaceData extends GeneratedMessageLite<PlaceProto$PlaceData, C7866a> implements PlaceProto$PlaceDataOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final PlaceProto$PlaceData f19696m = new PlaceProto$PlaceData();

    /* renamed from: n */
    private static volatile Parser<PlaceProto$PlaceData> f19697n;

    /* renamed from: e */
    private int f19698e;

    /* renamed from: f */
    private long f19699f;

    /* renamed from: g */
    private String f19700g = "";

    /* renamed from: h */
    private ProtobufList<C7867b> f19701h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private int f19702i;

    /* renamed from: j */
    private C6950b0 f19703j;

    /* renamed from: k */
    private C7297f0 f19704k;

    /* renamed from: l */
    private C7871b f19705l;

    /* renamed from: co.znly.models.places.PlaceProto$PlaceData$CategoryPathOrBuilder */
    public interface CategoryPathOrBuilder extends MessageLiteOrBuilder {
        C7875d getPath(int i);

        int getPathCount();

        List<C7875d> getPathList();

        int getPathValue(int i);

        List<Integer> getPathValueList();
    }

    /* renamed from: co.znly.models.places.PlaceProto$PlaceData$a */
    public static final class C7866a extends Builder<PlaceProto$PlaceData, C7866a> implements PlaceProto$PlaceDataOrBuilder {
        /* synthetic */ C7866a(C7870a aVar) {
            this();
        }

        public C7867b getCategories(int i) {
            return ((PlaceProto$PlaceData) this.instance).getCategories(i);
        }

        public int getCategoriesCount() {
            return ((PlaceProto$PlaceData) this.instance).getCategoriesCount();
        }

        public List<C7867b> getCategoriesList() {
            return Collections.unmodifiableList(((PlaceProto$PlaceData) this.instance).getCategoriesList());
        }

        public long getId() {
            return ((PlaceProto$PlaceData) this.instance).getId();
        }

        public String getName() {
            return ((PlaceProto$PlaceData) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((PlaceProto$PlaceData) this.instance).getNameBytes();
        }

        public C7871b getPersonalPlace() {
            return ((PlaceProto$PlaceData) this.instance).getPersonalPlace();
        }

        public C6950b0 getPoint() {
            return ((PlaceProto$PlaceData) this.instance).getPoint();
        }

        public C7297f0 getPolygon() {
            return ((PlaceProto$PlaceData) this.instance).getPolygon();
        }

        public C7877e getShape() {
            return ((PlaceProto$PlaceData) this.instance).getShape();
        }

        public int getShapeValue() {
            return ((PlaceProto$PlaceData) this.instance).getShapeValue();
        }

        public boolean hasPersonalPlace() {
            return ((PlaceProto$PlaceData) this.instance).hasPersonalPlace();
        }

        public boolean hasPoint() {
            return ((PlaceProto$PlaceData) this.instance).hasPoint();
        }

        public boolean hasPolygon() {
            return ((PlaceProto$PlaceData) this.instance).hasPolygon();
        }

        private C7866a() {
            super(PlaceProto$PlaceData.f19696m);
        }
    }

    /* renamed from: co.znly.models.places.PlaceProto$PlaceData$b */
    public static final class C7867b extends GeneratedMessageLite<C7867b, C7869b> implements CategoryPathOrBuilder {

        /* renamed from: f */
        private static final Converter<Integer, C7875d> f19706f = new C7868a();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7867b f19707g = new C7867b();

        /* renamed from: h */
        private static volatile Parser<C7867b> f19708h;

        /* renamed from: e */
        private IntList f19709e = GeneratedMessageLite.emptyIntList();

        /* renamed from: co.znly.models.places.PlaceProto$PlaceData$b$a */
        class C7868a implements Converter<Integer, C7875d> {
            C7868a() {
            }

            /* renamed from: a */
            public C7875d convert(Integer num) {
                C7875d a = C7875d.m18941a(num.intValue());
                return a == null ? C7875d.UNRECOGNIZED : a;
            }
        }

        /* renamed from: co.znly.models.places.PlaceProto$PlaceData$b$b */
        public static final class C7869b extends Builder<C7867b, C7869b> implements CategoryPathOrBuilder {
            /* synthetic */ C7869b(C7870a aVar) {
                this();
            }

            public C7875d getPath(int i) {
                return ((C7867b) this.instance).getPath(i);
            }

            public int getPathCount() {
                return ((C7867b) this.instance).getPathCount();
            }

            public List<C7875d> getPathList() {
                return ((C7867b) this.instance).getPathList();
            }

            public int getPathValue(int i) {
                return ((C7867b) this.instance).getPathValue(i);
            }

            public List<Integer> getPathValueList() {
                return Collections.unmodifiableList(((C7867b) this.instance).getPathValueList());
            }

            private C7869b() {
                super(C7867b.f19707g);
            }
        }

        static {
            f19707g.makeImmutable();
        }

        private C7867b() {
        }

        public static Parser<C7867b> parser() {
            return f19707g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7870a.f19710a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7867b();
                case 2:
                    return f19707g;
                case 3:
                    this.f19709e.makeImmutable();
                    return null;
                case 4:
                    return new C7869b(null);
                case 5:
                    this.f19709e = ((Visitor) obj).visitIntList(this.f19709e, ((C7867b) obj2).f19709e);
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
                                if (readTag == 8) {
                                    if (!this.f19709e.isModifiable()) {
                                        this.f19709e = GeneratedMessageLite.mutableCopy(this.f19709e);
                                    }
                                    this.f19709e.addInt(codedInputStream.readEnum());
                                } else if (readTag == 10) {
                                    if (!this.f19709e.isModifiable()) {
                                        this.f19709e = GeneratedMessageLite.mutableCopy(this.f19709e);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f19709e.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
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
                    if (f19708h == null) {
                        synchronized (C7867b.class) {
                            if (f19708h == null) {
                                f19708h = new DefaultInstanceBasedParser(f19707g);
                            }
                        }
                    }
                    return f19708h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f19707g;
        }

        public C7875d getPath(int i) {
            return (C7875d) f19706f.convert(Integer.valueOf(this.f19709e.getInt(i)));
        }

        public int getPathCount() {
            return this.f19709e.size();
        }

        public List<C7875d> getPathList() {
            return new ListAdapter(this.f19709e, f19706f);
        }

        public int getPathValue(int i) {
            return this.f19709e.getInt(i);
        }

        public List<Integer> getPathValueList() {
            return this.f19709e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f19709e.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.f19709e.getInt(i3));
            }
            int size = 0 + i2 + (this.f19709e.size() * 1);
            this.memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f19709e.size(); i++) {
                codedOutputStream.writeEnum(1, this.f19709e.getInt(i));
            }
        }
    }

    static {
        f19696m.makeImmutable();
    }

    private PlaceProto$PlaceData() {
    }

    public static PlaceProto$PlaceData getDefaultInstance() {
        return f19696m;
    }

    public static Parser<PlaceProto$PlaceData> parser() {
        return f19696m.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7870a.f19710a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaceProto$PlaceData();
            case 2:
                return f19696m;
            case 3:
                this.f19701h.makeImmutable();
                return null;
            case 4:
                return new C7866a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PlaceProto$PlaceData placeProto$PlaceData = (PlaceProto$PlaceData) obj2;
                this.f19699f = visitor.visitLong(this.f19699f != 0, this.f19699f, placeProto$PlaceData.f19699f != 0, placeProto$PlaceData.f19699f);
                this.f19700g = visitor.visitString(!this.f19700g.isEmpty(), this.f19700g, !placeProto$PlaceData.f19700g.isEmpty(), placeProto$PlaceData.f19700g);
                this.f19701h = visitor.visitList(this.f19701h, placeProto$PlaceData.f19701h);
                boolean z2 = this.f19702i != 0;
                int i = this.f19702i;
                if (placeProto$PlaceData.f19702i != 0) {
                    z = true;
                }
                this.f19702i = visitor.visitInt(z2, i, z, placeProto$PlaceData.f19702i);
                this.f19703j = (C6950b0) visitor.visitMessage(this.f19703j, placeProto$PlaceData.f19703j);
                this.f19704k = (C7297f0) visitor.visitMessage(this.f19704k, placeProto$PlaceData.f19704k);
                this.f19705l = (C7871b) visitor.visitMessage(this.f19705l, placeProto$PlaceData.f19705l);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f19698e |= placeProto$PlaceData.f19698e;
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
                                this.f19699f = codedInputStream.readUInt64();
                            } else if (readTag == 18) {
                                this.f19700g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 40) {
                                this.f19702i = codedInputStream.readEnum();
                            } else if (readTag == 50) {
                                Builder builder = this.f19703j != null ? (C6951a) this.f19703j.toBuilder() : null;
                                this.f19703j = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19703j);
                                    this.f19703j = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 58) {
                                Builder builder2 = this.f19704k != null ? (C7298a) this.f19704k.toBuilder() : null;
                                this.f19704k = (C7297f0) codedInputStream.readMessage(C7297f0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19704k);
                                    this.f19704k = (C7297f0) builder2.buildPartial();
                                }
                            } else if (readTag == 66) {
                                if (!this.f19701h.isModifiable()) {
                                    this.f19701h = GeneratedMessageLite.mutableCopy(this.f19701h);
                                }
                                this.f19701h.add(codedInputStream.readMessage(C7867b.parser(), extensionRegistryLite));
                            } else if (readTag == 74) {
                                Builder builder3 = this.f19705l != null ? (C7872a) this.f19705l.toBuilder() : null;
                                this.f19705l = (C7871b) codedInputStream.readMessage(C7871b.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f19705l);
                                    this.f19705l = (C7871b) builder3.buildPartial();
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
                if (f19697n == null) {
                    synchronized (PlaceProto$PlaceData.class) {
                        if (f19697n == null) {
                            f19697n = new DefaultInstanceBasedParser(f19696m);
                        }
                    }
                }
                return f19697n;
            default:
                throw new UnsupportedOperationException();
        }
        return f19696m;
    }

    public C7867b getCategories(int i) {
        return (C7867b) this.f19701h.get(i);
    }

    public int getCategoriesCount() {
        return this.f19701h.size();
    }

    public List<C7867b> getCategoriesList() {
        return this.f19701h;
    }

    public long getId() {
        return this.f19699f;
    }

    public String getName() {
        return this.f19700g;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f19700g);
    }

    public C7871b getPersonalPlace() {
        C7871b bVar = this.f19705l;
        return bVar == null ? C7871b.getDefaultInstance() : bVar;
    }

    public C6950b0 getPoint() {
        C6950b0 b0Var = this.f19703j;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public C7297f0 getPolygon() {
        C7297f0 f0Var = this.f19704k;
        return f0Var == null ? C7297f0.getDefaultInstance() : f0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f19699f;
        int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) + 0 : 0;
        if (!this.f19700g.isEmpty()) {
            computeUInt64Size += CodedOutputStream.computeStringSize(2, getName());
        }
        if (this.f19702i != C7877e.EMPTY.getNumber()) {
            computeUInt64Size += CodedOutputStream.computeEnumSize(5, this.f19702i);
        }
        if (this.f19703j != null) {
            computeUInt64Size += CodedOutputStream.computeMessageSize(6, getPoint());
        }
        if (this.f19704k != null) {
            computeUInt64Size += CodedOutputStream.computeMessageSize(7, getPolygon());
        }
        for (int i2 = 0; i2 < this.f19701h.size(); i2++) {
            computeUInt64Size += CodedOutputStream.computeMessageSize(8, (MessageLite) this.f19701h.get(i2));
        }
        if (this.f19705l != null) {
            computeUInt64Size += CodedOutputStream.computeMessageSize(9, getPersonalPlace());
        }
        this.memoizedSerializedSize = computeUInt64Size;
        return computeUInt64Size;
    }

    public C7877e getShape() {
        C7877e a = C7877e.m18942a(this.f19702i);
        return a == null ? C7877e.UNRECOGNIZED : a;
    }

    public int getShapeValue() {
        return this.f19702i;
    }

    public boolean hasPersonalPlace() {
        return this.f19705l != null;
    }

    public boolean hasPoint() {
        return this.f19703j != null;
    }

    public boolean hasPolygon() {
        return this.f19704k != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f19699f;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        if (!this.f19700g.isEmpty()) {
            codedOutputStream.writeString(2, getName());
        }
        if (this.f19702i != C7877e.EMPTY.getNumber()) {
            codedOutputStream.writeEnum(5, this.f19702i);
        }
        if (this.f19703j != null) {
            codedOutputStream.writeMessage(6, getPoint());
        }
        if (this.f19704k != null) {
            codedOutputStream.writeMessage(7, getPolygon());
        }
        for (int i = 0; i < this.f19701h.size(); i++) {
            codedOutputStream.writeMessage(8, (MessageLite) this.f19701h.get(i));
        }
        if (this.f19705l != null) {
            codedOutputStream.writeMessage(9, getPersonalPlace());
        }
    }
}
