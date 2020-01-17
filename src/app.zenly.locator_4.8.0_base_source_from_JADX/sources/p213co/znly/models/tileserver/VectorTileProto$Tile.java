package p213co.znly.models.tileserver;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.tileserver.VectorTileProto$Tile */
public final class VectorTileProto$Tile extends GeneratedMessageLite<VectorTileProto$Tile, C8416a> implements VectorTileProto$TileOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final VectorTileProto$Tile f21313f = new VectorTileProto$Tile();

    /* renamed from: g */
    private static volatile Parser<VectorTileProto$Tile> f21314g;

    /* renamed from: e */
    private ProtobufList<C8421d> f21315e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$FeatureOrBuilder */
    public interface FeatureOrBuilder extends MessageLiteOrBuilder {
        int getGeometry(int i);

        int getGeometryCount();

        List<Integer> getGeometryList();

        long getId();

        int getTags(int i);

        int getTagsCount();

        List<Integer> getTagsList();

        C8419c getType();

        int getTypeValue();
    }

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$LayerOrBuilder */
    public interface LayerOrBuilder extends MessageLiteOrBuilder {
        int getExtent();

        C8417b getFeatures(int i);

        int getFeaturesCount();

        List<C8417b> getFeaturesList();

        String getKeys(int i);

        ByteString getKeysBytes(int i);

        int getKeysCount();

        List<String> getKeysList();

        String getName();

        ByteString getNameBytes();

        C8423e getValues(int i);

        int getValuesCount();

        List<C8423e> getValuesList();

        int getVersion();
    }

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$ValueOrBuilder */
    public interface ValueOrBuilder extends MessageLiteOrBuilder {
        boolean getBoolValue();

        double getDoubleValue();

        float getFloatValue();

        long getIntValue();

        long getSintValue();

        String getStringValue();

        ByteString getStringValueBytes();

        long getUintValue();
    }

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$a */
    public static final class C8416a extends Builder<VectorTileProto$Tile, C8416a> implements VectorTileProto$TileOrBuilder {
        /* synthetic */ C8416a(C8425a aVar) {
            this();
        }

        public C8421d getLayers(int i) {
            return ((VectorTileProto$Tile) this.instance).getLayers(i);
        }

        public int getLayersCount() {
            return ((VectorTileProto$Tile) this.instance).getLayersCount();
        }

        public List<C8421d> getLayersList() {
            return Collections.unmodifiableList(((VectorTileProto$Tile) this.instance).getLayersList());
        }

        private C8416a() {
            super(VectorTileProto$Tile.f21313f);
        }
    }

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$b */
    public static final class C8417b extends GeneratedMessageLite<C8417b, C8418a> implements FeatureOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final C8417b f21316l = new C8417b();

        /* renamed from: m */
        private static volatile Parser<C8417b> f21317m;

        /* renamed from: e */
        private int f21318e;

        /* renamed from: f */
        private long f21319f;

        /* renamed from: g */
        private IntList f21320g = GeneratedMessageLite.emptyIntList();

        /* renamed from: h */
        private int f21321h = -1;

        /* renamed from: i */
        private int f21322i;

        /* renamed from: j */
        private IntList f21323j = GeneratedMessageLite.emptyIntList();

        /* renamed from: k */
        private int f21324k = -1;

        /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$b$a */
        public static final class C8418a extends Builder<C8417b, C8418a> implements FeatureOrBuilder {
            /* synthetic */ C8418a(C8425a aVar) {
                this();
            }

            public int getGeometry(int i) {
                return ((C8417b) this.instance).getGeometry(i);
            }

            public int getGeometryCount() {
                return ((C8417b) this.instance).getGeometryCount();
            }

            public List<Integer> getGeometryList() {
                return Collections.unmodifiableList(((C8417b) this.instance).getGeometryList());
            }

            public long getId() {
                return ((C8417b) this.instance).getId();
            }

            public int getTags(int i) {
                return ((C8417b) this.instance).getTags(i);
            }

            public int getTagsCount() {
                return ((C8417b) this.instance).getTagsCount();
            }

            public List<Integer> getTagsList() {
                return Collections.unmodifiableList(((C8417b) this.instance).getTagsList());
            }

            public C8419c getType() {
                return ((C8417b) this.instance).getType();
            }

            public int getTypeValue() {
                return ((C8417b) this.instance).getTypeValue();
            }

            private C8418a() {
                super(C8417b.f21316l);
            }
        }

        static {
            f21316l.makeImmutable();
        }

        private C8417b() {
        }

        public static Parser<C8417b> parser() {
            return f21316l.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8425a.f21350a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C8417b();
                case 2:
                    return f21316l;
                case 3:
                    this.f21320g.makeImmutable();
                    this.f21323j.makeImmutable();
                    return null;
                case 4:
                    return new C8418a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C8417b bVar = (C8417b) obj2;
                    this.f21319f = visitor.visitLong(this.f21319f != 0, this.f21319f, bVar.f21319f != 0, bVar.f21319f);
                    this.f21320g = visitor.visitIntList(this.f21320g, bVar.f21320g);
                    boolean z2 = this.f21322i != 0;
                    int i = this.f21322i;
                    if (bVar.f21322i != 0) {
                        z = true;
                    }
                    this.f21322i = visitor.visitInt(z2, i, z, bVar.f21322i);
                    this.f21323j = visitor.visitIntList(this.f21323j, bVar.f21323j);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f21318e |= bVar.f21318e;
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
                                    this.f21319f = codedInputStream.readUInt64();
                                } else if (readTag == 16) {
                                    if (!this.f21320g.isModifiable()) {
                                        this.f21320g = GeneratedMessageLite.mutableCopy(this.f21320g);
                                    }
                                    this.f21320g.addInt(codedInputStream.readUInt32());
                                } else if (readTag == 18) {
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if (!this.f21320g.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f21320g = GeneratedMessageLite.mutableCopy(this.f21320g);
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f21320g.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                } else if (readTag == 24) {
                                    this.f21322i = codedInputStream.readEnum();
                                } else if (readTag == 32) {
                                    if (!this.f21323j.isModifiable()) {
                                        this.f21323j = GeneratedMessageLite.mutableCopy(this.f21323j);
                                    }
                                    this.f21323j.addInt(codedInputStream.readUInt32());
                                } else if (readTag == 34) {
                                    int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if (!this.f21323j.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f21323j = GeneratedMessageLite.mutableCopy(this.f21323j);
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f21323j.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(pushLimit2);
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
                    if (f21317m == null) {
                        synchronized (C8417b.class) {
                            if (f21317m == null) {
                                f21317m = new DefaultInstanceBasedParser(f21316l);
                            }
                        }
                    }
                    return f21317m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f21316l;
        }

        public int getGeometry(int i) {
            return this.f21323j.getInt(i);
        }

        public int getGeometryCount() {
            return this.f21323j.size();
        }

        public List<Integer> getGeometryList() {
            return this.f21323j;
        }

        public long getId() {
            return this.f21319f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.f21319f;
            int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f21320g.size(); i3++) {
                i2 += CodedOutputStream.computeUInt32SizeNoTag(this.f21320g.getInt(i3));
            }
            int i4 = computeUInt64Size + i2;
            if (!getTagsList().isEmpty()) {
                i4 = i4 + 1 + CodedOutputStream.computeInt32SizeNoTag(i2);
            }
            this.f21321h = i2;
            if (this.f21322i != C8419c.UNKNOWN.getNumber()) {
                i4 += CodedOutputStream.computeEnumSize(3, this.f21322i);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f21323j.size(); i6++) {
                i5 += CodedOutputStream.computeUInt32SizeNoTag(this.f21323j.getInt(i6));
            }
            int i7 = i4 + i5;
            if (!getGeometryList().isEmpty()) {
                i7 = i7 + 1 + CodedOutputStream.computeInt32SizeNoTag(i5);
            }
            this.f21324k = i5;
            this.memoizedSerializedSize = i7;
            return i7;
        }

        public int getTags(int i) {
            return this.f21320g.getInt(i);
        }

        public int getTagsCount() {
            return this.f21320g.size();
        }

        public List<Integer> getTagsList() {
            return this.f21320g;
        }

        public C8419c getType() {
            C8419c a = C8419c.m19501a(this.f21322i);
            return a == null ? C8419c.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.f21322i;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            long j = this.f21319f;
            if (j != 0) {
                codedOutputStream.writeUInt64(1, j);
            }
            if (getTagsList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.f21321h);
            }
            for (int i = 0; i < this.f21320g.size(); i++) {
                codedOutputStream.writeUInt32NoTag(this.f21320g.getInt(i));
            }
            if (this.f21322i != C8419c.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(3, this.f21322i);
            }
            if (getGeometryList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(34);
                codedOutputStream.writeUInt32NoTag(this.f21324k);
            }
            for (int i2 = 0; i2 < this.f21323j.size(); i2++) {
                codedOutputStream.writeUInt32NoTag(this.f21323j.getInt(i2));
            }
        }
    }

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$c */
    public enum C8419c implements EnumLite {
        UNKNOWN(0),
        POINT(1),
        LINESTRING(2),
        POLYGON(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21331e;

        /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$c$a */
        class C8420a implements EnumLiteMap<C8419c> {
            C8420a() {
            }

            public C8419c findValueByNumber(int i) {
                return C8419c.m19501a(i);
            }
        }

        static {
            new C8420a();
        }

        private C8419c(int i) {
            this.f21331e = i;
        }

        /* renamed from: a */
        public static C8419c m19501a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return POINT;
            }
            if (i == 2) {
                return LINESTRING;
            }
            if (i != 3) {
                return null;
            }
            return POLYGON;
        }

        public final int getNumber() {
            return this.f21331e;
        }
    }

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$d */
    public static final class C8421d extends GeneratedMessageLite<C8421d, C8422a> implements LayerOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final C8421d f21332l = new C8421d();

        /* renamed from: m */
        private static volatile Parser<C8421d> f21333m;

        /* renamed from: e */
        private int f21334e;

        /* renamed from: f */
        private int f21335f;

        /* renamed from: g */
        private String f21336g = "";

        /* renamed from: h */
        private ProtobufList<C8417b> f21337h = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: i */
        private ProtobufList<String> f21338i = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: j */
        private ProtobufList<C8423e> f21339j = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: k */
        private int f21340k;

        /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$d$a */
        public static final class C8422a extends Builder<C8421d, C8422a> implements LayerOrBuilder {
            /* synthetic */ C8422a(C8425a aVar) {
                this();
            }

            public int getExtent() {
                return ((C8421d) this.instance).getExtent();
            }

            public C8417b getFeatures(int i) {
                return ((C8421d) this.instance).getFeatures(i);
            }

            public int getFeaturesCount() {
                return ((C8421d) this.instance).getFeaturesCount();
            }

            public List<C8417b> getFeaturesList() {
                return Collections.unmodifiableList(((C8421d) this.instance).getFeaturesList());
            }

            public String getKeys(int i) {
                return ((C8421d) this.instance).getKeys(i);
            }

            public ByteString getKeysBytes(int i) {
                return ((C8421d) this.instance).getKeysBytes(i);
            }

            public int getKeysCount() {
                return ((C8421d) this.instance).getKeysCount();
            }

            public List<String> getKeysList() {
                return Collections.unmodifiableList(((C8421d) this.instance).getKeysList());
            }

            public String getName() {
                return ((C8421d) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((C8421d) this.instance).getNameBytes();
            }

            public C8423e getValues(int i) {
                return ((C8421d) this.instance).getValues(i);
            }

            public int getValuesCount() {
                return ((C8421d) this.instance).getValuesCount();
            }

            public List<C8423e> getValuesList() {
                return Collections.unmodifiableList(((C8421d) this.instance).getValuesList());
            }

            public int getVersion() {
                return ((C8421d) this.instance).getVersion();
            }

            private C8422a() {
                super(C8421d.f21332l);
            }
        }

        static {
            f21332l.makeImmutable();
        }

        private C8421d() {
        }

        public static Parser<C8421d> parser() {
            return f21332l.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8425a.f21350a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C8421d();
                case 2:
                    return f21332l;
                case 3:
                    this.f21337h.makeImmutable();
                    this.f21338i.makeImmutable();
                    this.f21339j.makeImmutable();
                    return null;
                case 4:
                    return new C8422a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C8421d dVar = (C8421d) obj2;
                    this.f21335f = visitor.visitInt(this.f21335f != 0, this.f21335f, dVar.f21335f != 0, dVar.f21335f);
                    this.f21336g = visitor.visitString(!this.f21336g.isEmpty(), this.f21336g, !dVar.f21336g.isEmpty(), dVar.f21336g);
                    this.f21337h = visitor.visitList(this.f21337h, dVar.f21337h);
                    this.f21338i = visitor.visitList(this.f21338i, dVar.f21338i);
                    this.f21339j = visitor.visitList(this.f21339j, dVar.f21339j);
                    boolean z2 = this.f21340k != 0;
                    int i = this.f21340k;
                    if (dVar.f21340k != 0) {
                        z = true;
                    }
                    this.f21340k = visitor.visitInt(z2, i, z, dVar.f21340k);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f21334e |= dVar.f21334e;
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
                                    this.f21336g = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    if (!this.f21337h.isModifiable()) {
                                        this.f21337h = GeneratedMessageLite.mutableCopy(this.f21337h);
                                    }
                                    this.f21337h.add(codedInputStream.readMessage(C8417b.parser(), extensionRegistryLite));
                                } else if (readTag == 26) {
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.f21338i.isModifiable()) {
                                        this.f21338i = GeneratedMessageLite.mutableCopy(this.f21338i);
                                    }
                                    this.f21338i.add(readStringRequireUtf8);
                                } else if (readTag == 34) {
                                    if (!this.f21339j.isModifiable()) {
                                        this.f21339j = GeneratedMessageLite.mutableCopy(this.f21339j);
                                    }
                                    this.f21339j.add(codedInputStream.readMessage(C8423e.parser(), extensionRegistryLite));
                                } else if (readTag == 40) {
                                    this.f21340k = codedInputStream.readUInt32();
                                } else if (readTag == 120) {
                                    this.f21335f = codedInputStream.readUInt32();
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
                    if (f21333m == null) {
                        synchronized (C8421d.class) {
                            if (f21333m == null) {
                                f21333m = new DefaultInstanceBasedParser(f21332l);
                            }
                        }
                    }
                    return f21333m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f21332l;
        }

        public int getExtent() {
            return this.f21340k;
        }

        public C8417b getFeatures(int i) {
            return (C8417b) this.f21337h.get(i);
        }

        public int getFeaturesCount() {
            return this.f21337h.size();
        }

        public List<C8417b> getFeaturesList() {
            return this.f21337h;
        }

        public String getKeys(int i) {
            return (String) this.f21338i.get(i);
        }

        public ByteString getKeysBytes(int i) {
            return ByteString.copyFromUtf8((String) this.f21338i.get(i));
        }

        public int getKeysCount() {
            return this.f21338i.size();
        }

        public List<String> getKeysList() {
            return this.f21338i;
        }

        public String getName() {
            return this.f21336g;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.f21336g);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.f21336g.isEmpty() ? CodedOutputStream.computeStringSize(1, getName()) + 0 : 0;
            for (int i2 = 0; i2 < this.f21337h.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f21337h.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f21338i.size(); i4++) {
                i3 += CodedOutputStream.computeStringSizeNoTag((String) this.f21338i.get(i4));
            }
            int size = computeStringSize + i3 + (getKeysList().size() * 1);
            for (int i5 = 0; i5 < this.f21339j.size(); i5++) {
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f21339j.get(i5));
            }
            int i6 = this.f21340k;
            if (i6 != 0) {
                size += CodedOutputStream.computeUInt32Size(5, i6);
            }
            int i7 = this.f21335f;
            if (i7 != 0) {
                size += CodedOutputStream.computeUInt32Size(15, i7);
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        public C8423e getValues(int i) {
            return (C8423e) this.f21339j.get(i);
        }

        public int getValuesCount() {
            return this.f21339j.size();
        }

        public List<C8423e> getValuesList() {
            return this.f21339j;
        }

        public int getVersion() {
            return this.f21335f;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f21336g.isEmpty()) {
                codedOutputStream.writeString(1, getName());
            }
            for (int i = 0; i < this.f21337h.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f21337h.get(i));
            }
            for (int i2 = 0; i2 < this.f21338i.size(); i2++) {
                codedOutputStream.writeString(3, (String) this.f21338i.get(i2));
            }
            for (int i3 = 0; i3 < this.f21339j.size(); i3++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f21339j.get(i3));
            }
            int i4 = this.f21340k;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(5, i4);
            }
            int i5 = this.f21335f;
            if (i5 != 0) {
                codedOutputStream.writeUInt32(15, i5);
            }
        }
    }

    /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$e */
    public static final class C8423e extends GeneratedMessageLite<C8423e, C8424a> implements ValueOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final C8423e f21341l = new C8423e();

        /* renamed from: m */
        private static volatile Parser<C8423e> f21342m;

        /* renamed from: e */
        private String f21343e = "";

        /* renamed from: f */
        private float f21344f;

        /* renamed from: g */
        private double f21345g;

        /* renamed from: h */
        private long f21346h;

        /* renamed from: i */
        private long f21347i;

        /* renamed from: j */
        private long f21348j;

        /* renamed from: k */
        private boolean f21349k;

        /* renamed from: co.znly.models.tileserver.VectorTileProto$Tile$e$a */
        public static final class C8424a extends Builder<C8423e, C8424a> implements ValueOrBuilder {
            /* synthetic */ C8424a(C8425a aVar) {
                this();
            }

            public boolean getBoolValue() {
                return ((C8423e) this.instance).getBoolValue();
            }

            public double getDoubleValue() {
                return ((C8423e) this.instance).getDoubleValue();
            }

            public float getFloatValue() {
                return ((C8423e) this.instance).getFloatValue();
            }

            public long getIntValue() {
                return ((C8423e) this.instance).getIntValue();
            }

            public long getSintValue() {
                return ((C8423e) this.instance).getSintValue();
            }

            public String getStringValue() {
                return ((C8423e) this.instance).getStringValue();
            }

            public ByteString getStringValueBytes() {
                return ((C8423e) this.instance).getStringValueBytes();
            }

            public long getUintValue() {
                return ((C8423e) this.instance).getUintValue();
            }

            private C8424a() {
                super(C8423e.f21341l);
            }
        }

        static {
            f21341l.makeImmutable();
        }

        private C8423e() {
        }

        public static Parser<C8423e> parser() {
            return f21341l.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8425a.f21350a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C8423e();
                case 2:
                    return f21341l;
                case 3:
                    return null;
                case 4:
                    return new C8424a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C8423e eVar = (C8423e) obj2;
                    this.f21343e = visitor.visitString(!this.f21343e.isEmpty(), this.f21343e, !eVar.f21343e.isEmpty(), eVar.f21343e);
                    this.f21344f = visitor.visitFloat(this.f21344f != 0.0f, this.f21344f, eVar.f21344f != 0.0f, eVar.f21344f);
                    this.f21345g = visitor.visitDouble(this.f21345g != 0.0d, this.f21345g, eVar.f21345g != 0.0d, eVar.f21345g);
                    this.f21346h = visitor.visitLong(this.f21346h != 0, this.f21346h, eVar.f21346h != 0, eVar.f21346h);
                    this.f21347i = visitor.visitLong(this.f21347i != 0, this.f21347i, eVar.f21347i != 0, eVar.f21347i);
                    this.f21348j = visitor.visitLong(this.f21348j != 0, this.f21348j, eVar.f21348j != 0, eVar.f21348j);
                    boolean z2 = this.f21349k;
                    boolean z3 = eVar.f21349k;
                    this.f21349k = visitor.visitBoolean(z2, z2, z3, z3);
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
                                    this.f21343e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 21) {
                                    this.f21344f = codedInputStream.readFloat();
                                } else if (readTag == 25) {
                                    this.f21345g = codedInputStream.readDouble();
                                } else if (readTag == 32) {
                                    this.f21346h = codedInputStream.readInt64();
                                } else if (readTag == 40) {
                                    this.f21347i = codedInputStream.readUInt64();
                                } else if (readTag == 48) {
                                    this.f21348j = codedInputStream.readSInt64();
                                } else if (readTag == 56) {
                                    this.f21349k = codedInputStream.readBool();
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
                    if (f21342m == null) {
                        synchronized (C8423e.class) {
                            if (f21342m == null) {
                                f21342m = new DefaultInstanceBasedParser(f21341l);
                            }
                        }
                    }
                    return f21342m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f21341l;
        }

        public boolean getBoolValue() {
            return this.f21349k;
        }

        public double getDoubleValue() {
            return this.f21345g;
        }

        public float getFloatValue() {
            return this.f21344f;
        }

        public long getIntValue() {
            return this.f21346h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f21343e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getStringValue());
            }
            float f = this.f21344f;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(2, f);
            }
            double d = this.f21345g;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(3, d);
            }
            long j = this.f21346h;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(4, j);
            }
            long j2 = this.f21347i;
            if (j2 != 0) {
                i2 += CodedOutputStream.computeUInt64Size(5, j2);
            }
            long j3 = this.f21348j;
            if (j3 != 0) {
                i2 += CodedOutputStream.computeSInt64Size(6, j3);
            }
            boolean z = this.f21349k;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(7, z);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public long getSintValue() {
            return this.f21348j;
        }

        public String getStringValue() {
            return this.f21343e;
        }

        public ByteString getStringValueBytes() {
            return ByteString.copyFromUtf8(this.f21343e);
        }

        public long getUintValue() {
            return this.f21347i;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f21343e.isEmpty()) {
                codedOutputStream.writeString(1, getStringValue());
            }
            float f = this.f21344f;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(2, f);
            }
            double d = this.f21345g;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(3, d);
            }
            long j = this.f21346h;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            long j2 = this.f21347i;
            if (j2 != 0) {
                codedOutputStream.writeUInt64(5, j2);
            }
            long j3 = this.f21348j;
            if (j3 != 0) {
                codedOutputStream.writeSInt64(6, j3);
            }
            boolean z = this.f21349k;
            if (z) {
                codedOutputStream.writeBool(7, z);
            }
        }
    }

    static {
        f21313f.makeImmutable();
    }

    private VectorTileProto$Tile() {
    }

    public static C8416a newBuilder() {
        return (C8416a) f21313f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8425a.f21350a[methodToInvoke.ordinal()]) {
            case 1:
                return new VectorTileProto$Tile();
            case 2:
                return f21313f;
            case 3:
                this.f21315e.makeImmutable();
                return null;
            case 4:
                return new C8416a(null);
            case 5:
                this.f21315e = ((Visitor) obj).visitList(this.f21315e, ((VectorTileProto$Tile) obj2).f21315e);
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
                            if (readTag == 26) {
                                if (!this.f21315e.isModifiable()) {
                                    this.f21315e = GeneratedMessageLite.mutableCopy(this.f21315e);
                                }
                                this.f21315e.add(codedInputStream.readMessage(C8421d.parser(), extensionRegistryLite));
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
                if (f21314g == null) {
                    synchronized (VectorTileProto$Tile.class) {
                        if (f21314g == null) {
                            f21314g = new DefaultInstanceBasedParser(f21313f);
                        }
                    }
                }
                return f21314g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21313f;
    }

    public C8421d getLayers(int i) {
        return (C8421d) this.f21315e.get(i);
    }

    public int getLayersCount() {
        return this.f21315e.size();
    }

    public List<C8421d> getLayersList() {
        return this.f21315e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21315e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f21315e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f21315e.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f21315e.get(i));
        }
    }
}
