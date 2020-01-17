package p213co.znly.models.reversegeocoder;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.DoubleList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7272d0.C7273a;

/* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape */
public final class ReverseGeoCoderProto$Shape extends GeneratedMessageLite<ReverseGeoCoderProto$Shape, C7892a> implements ReverseGeoCoderProto$ShapeOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final ReverseGeoCoderProto$Shape f19961o = new ReverseGeoCoderProto$Shape();

    /* renamed from: p */
    private static volatile Parser<ReverseGeoCoderProto$Shape> f19962p;

    /* renamed from: e */
    private int f19963e;

    /* renamed from: f */
    private long f19964f;

    /* renamed from: g */
    private int f19965g;

    /* renamed from: h */
    private String f19966h;

    /* renamed from: i */
    private long f19967i;

    /* renamed from: j */
    private ProtobufList<C7893b> f19968j = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: k */
    private String f19969k;

    /* renamed from: l */
    private double f19970l;

    /* renamed from: m */
    private C6950b0 f19971m;

    /* renamed from: n */
    private C7895c f19972n;

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape$OuterOrBuilder */
    public interface OuterOrBuilder extends MessageLiteOrBuilder {
        C7272d0 getBbox();

        double getPoints(int i);

        int getPointsCount();

        List<Double> getPointsList();

        boolean hasBbox();
    }

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape$ParentCountryOrBuilder */
    public interface ParentCountryOrBuilder extends MessageLiteOrBuilder {
        long getId();

        String getIsoCode();

        ByteString getIsoCodeBytes();
    }

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape$a */
    public static final class C7892a extends Builder<ReverseGeoCoderProto$Shape, C7892a> implements ReverseGeoCoderProto$ShapeOrBuilder {
        /* synthetic */ C7892a(C7910a aVar) {
            this();
        }

        public double getAreaSqm() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getAreaSqm();
        }

        public C6950b0 getCentroid() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getCentroid();
        }

        public long getCountryId() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getCountryId();
        }

        public String getCountryIsoCode() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getCountryIsoCode();
        }

        public ByteString getCountryIsoCodeBytes() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getCountryIsoCodeBytes();
        }

        public long getId() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getId();
        }

        public String getLocalizedName() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getLocalizedName();
        }

        public ByteString getLocalizedNameBytes() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getLocalizedNameBytes();
        }

        public C7893b getOuters(int i) {
            return ((ReverseGeoCoderProto$Shape) this.instance).getOuters(i);
        }

        public int getOutersCount() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getOutersCount();
        }

        public List<C7893b> getOutersList() {
            return Collections.unmodifiableList(((ReverseGeoCoderProto$Shape) this.instance).getOutersList());
        }

        public C7895c getParentCountry() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getParentCountry();
        }

        public C7917e getType() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getType();
        }

        public int getTypeValue() {
            return ((ReverseGeoCoderProto$Shape) this.instance).getTypeValue();
        }

        public boolean hasCentroid() {
            return ((ReverseGeoCoderProto$Shape) this.instance).hasCentroid();
        }

        public boolean hasParentCountry() {
            return ((ReverseGeoCoderProto$Shape) this.instance).hasParentCountry();
        }

        private C7892a() {
            super(ReverseGeoCoderProto$Shape.f19961o);
        }
    }

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape$b */
    public static final class C7893b extends GeneratedMessageLite<C7893b, C7894a> implements OuterOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7893b f19973h = new C7893b();

        /* renamed from: i */
        private static volatile Parser<C7893b> f19974i;

        /* renamed from: e */
        private int f19975e;

        /* renamed from: f */
        private DoubleList f19976f = GeneratedMessageLite.emptyDoubleList();

        /* renamed from: g */
        private C7272d0 f19977g;

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape$b$a */
        public static final class C7894a extends Builder<C7893b, C7894a> implements OuterOrBuilder {
            /* synthetic */ C7894a(C7910a aVar) {
                this();
            }

            public C7272d0 getBbox() {
                return ((C7893b) this.instance).getBbox();
            }

            public double getPoints(int i) {
                return ((C7893b) this.instance).getPoints(i);
            }

            public int getPointsCount() {
                return ((C7893b) this.instance).getPointsCount();
            }

            public List<Double> getPointsList() {
                return Collections.unmodifiableList(((C7893b) this.instance).getPointsList());
            }

            public boolean hasBbox() {
                return ((C7893b) this.instance).hasBbox();
            }

            private C7894a() {
                super(C7893b.f19973h);
            }
        }

        static {
            f19973h.makeImmutable();
        }

        private C7893b() {
        }

        public static Parser<C7893b> parser() {
            return f19973h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7893b();
                case 2:
                    return f19973h;
                case 3:
                    this.f19976f.makeImmutable();
                    return null;
                case 4:
                    return new C7894a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7893b bVar = (C7893b) obj2;
                    this.f19976f = visitor.visitDoubleList(this.f19976f, bVar.f19976f);
                    this.f19977g = (C7272d0) visitor.visitMessage(this.f19977g, bVar.f19977g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f19975e |= bVar.f19975e;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 18) {
                                    Builder builder = this.f19977g != null ? (C7273a) this.f19977g.toBuilder() : null;
                                    this.f19977g = (C7272d0) codedInputStream.readMessage(C7272d0.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f19977g);
                                        this.f19977g = (C7272d0) builder.buildPartial();
                                    }
                                } else if (readTag == 9) {
                                    if (!this.f19976f.isModifiable()) {
                                        this.f19976f = GeneratedMessageLite.mutableCopy(this.f19976f);
                                    }
                                    this.f19976f.addDouble(codedInputStream.readDouble());
                                } else if (readTag == 10) {
                                    int readRawVarint32 = codedInputStream.readRawVarint32();
                                    int pushLimit = codedInputStream.pushLimit(readRawVarint32);
                                    if (!this.f19976f.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f19976f = this.f19976f.mutableCopyWithCapacity(this.f19976f.size() + (readRawVarint32 / 8));
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f19976f.addDouble(codedInputStream.readDouble());
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
                    if (f19974i == null) {
                        synchronized (C7893b.class) {
                            if (f19974i == null) {
                                f19974i = new DefaultInstanceBasedParser(f19973h);
                            }
                        }
                    }
                    return f19974i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f19973h;
        }

        public C7272d0 getBbox() {
            C7272d0 d0Var = this.f19977g;
            return d0Var == null ? C7272d0.getDefaultInstance() : d0Var;
        }

        public double getPoints(int i) {
            return this.f19976f.getDouble(i);
        }

        public int getPointsCount() {
            return this.f19976f.size();
        }

        public List<Double> getPointsList() {
            return this.f19976f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int size = (getPointsList().size() * 8) + 0 + (getPointsList().size() * 1);
            if (this.f19977g != null) {
                size += CodedOutputStream.computeMessageSize(2, getBbox());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasBbox() {
            return this.f19977g != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f19976f.size(); i++) {
                codedOutputStream.writeDouble(1, this.f19976f.getDouble(i));
            }
            if (this.f19977g != null) {
                codedOutputStream.writeMessage(2, getBbox());
            }
        }
    }

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape$c */
    public static final class C7895c extends GeneratedMessageLite<C7895c, C7896a> implements ParentCountryOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7895c f19978g = new C7895c();

        /* renamed from: h */
        private static volatile Parser<C7895c> f19979h;

        /* renamed from: e */
        private String f19980e = "";

        /* renamed from: f */
        private long f19981f;

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape$c$a */
        public static final class C7896a extends Builder<C7895c, C7896a> implements ParentCountryOrBuilder {
            /* synthetic */ C7896a(C7910a aVar) {
                this();
            }

            public long getId() {
                return ((C7895c) this.instance).getId();
            }

            public String getIsoCode() {
                return ((C7895c) this.instance).getIsoCode();
            }

            public ByteString getIsoCodeBytes() {
                return ((C7895c) this.instance).getIsoCodeBytes();
            }

            private C7896a() {
                super(C7895c.f19978g);
            }
        }

        static {
            f19978g.makeImmutable();
        }

        private C7895c() {
        }

        public static C7895c getDefaultInstance() {
            return f19978g;
        }

        public static Parser<C7895c> parser() {
            return f19978g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7895c();
                case 2:
                    return f19978g;
                case 3:
                    return null;
                case 4:
                    return new C7896a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7895c cVar = (C7895c) obj2;
                    this.f19980e = visitor.visitString(!this.f19980e.isEmpty(), this.f19980e, !cVar.f19980e.isEmpty(), cVar.f19980e);
                    this.f19981f = visitor.visitLong(this.f19981f != 0, this.f19981f, cVar.f19981f != 0, cVar.f19981f);
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
                                    this.f19980e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f19981f = codedInputStream.readUInt64();
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
                    if (f19979h == null) {
                        synchronized (C7895c.class) {
                            if (f19979h == null) {
                                f19979h = new DefaultInstanceBasedParser(f19978g);
                            }
                        }
                    }
                    return f19979h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f19978g;
        }

        public long getId() {
            return this.f19981f;
        }

        public String getIsoCode() {
            return this.f19980e;
        }

        public ByteString getIsoCodeBytes() {
            return ByteString.copyFromUtf8(this.f19980e);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f19980e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getIsoCode());
            }
            long j = this.f19981f;
            if (j != 0) {
                i2 += CodedOutputStream.computeUInt64Size(2, j);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f19980e.isEmpty()) {
                codedOutputStream.writeString(1, getIsoCode());
            }
            long j = this.f19981f;
            if (j != 0) {
                codedOutputStream.writeUInt64(2, j);
            }
        }
    }

    static {
        f19961o.makeImmutable();
    }

    private ReverseGeoCoderProto$Shape() {
        String str = "";
        this.f19966h = str;
        this.f19969k = str;
    }

    public static ReverseGeoCoderProto$Shape getDefaultInstance() {
        return f19961o;
    }

    public static Parser<ReverseGeoCoderProto$Shape> parser() {
        return f19961o.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReverseGeoCoderProto$Shape();
            case 2:
                return f19961o;
            case 3:
                this.f19968j.makeImmutable();
                return null;
            case 4:
                return new C7892a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ReverseGeoCoderProto$Shape reverseGeoCoderProto$Shape = (ReverseGeoCoderProto$Shape) obj2;
                this.f19964f = visitor.visitLong(this.f19964f != 0, this.f19964f, reverseGeoCoderProto$Shape.f19964f != 0, reverseGeoCoderProto$Shape.f19964f);
                this.f19965g = visitor.visitInt(this.f19965g != 0, this.f19965g, reverseGeoCoderProto$Shape.f19965g != 0, reverseGeoCoderProto$Shape.f19965g);
                this.f19966h = visitor.visitString(!this.f19966h.isEmpty(), this.f19966h, !reverseGeoCoderProto$Shape.f19966h.isEmpty(), reverseGeoCoderProto$Shape.f19966h);
                this.f19967i = visitor.visitLong(this.f19967i != 0, this.f19967i, reverseGeoCoderProto$Shape.f19967i != 0, reverseGeoCoderProto$Shape.f19967i);
                this.f19968j = visitor.visitList(this.f19968j, reverseGeoCoderProto$Shape.f19968j);
                this.f19969k = visitor.visitString(!this.f19969k.isEmpty(), this.f19969k, !reverseGeoCoderProto$Shape.f19969k.isEmpty(), reverseGeoCoderProto$Shape.f19969k);
                this.f19970l = visitor.visitDouble(this.f19970l != 0.0d, this.f19970l, reverseGeoCoderProto$Shape.f19970l != 0.0d, reverseGeoCoderProto$Shape.f19970l);
                this.f19971m = (C6950b0) visitor.visitMessage(this.f19971m, reverseGeoCoderProto$Shape.f19971m);
                this.f19972n = (C7895c) visitor.visitMessage(this.f19972n, reverseGeoCoderProto$Shape.f19972n);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f19963e |= reverseGeoCoderProto$Shape.f19963e;
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
                                this.f19965g = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                this.f19969k = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 33) {
                                this.f19970l = codedInputStream.readDouble();
                            } else if (readTag == 42) {
                                Builder builder = this.f19971m != null ? (C6951a) this.f19971m.toBuilder() : null;
                                this.f19971m = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19971m);
                                    this.f19971m = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 48) {
                                this.f19964f = codedInputStream.readUInt64();
                            } else if (readTag == 58) {
                                if (!this.f19968j.isModifiable()) {
                                    this.f19968j = GeneratedMessageLite.mutableCopy(this.f19968j);
                                }
                                this.f19968j.add(codedInputStream.readMessage(C7893b.parser(), extensionRegistryLite));
                            } else if (readTag == 66) {
                                this.f19966h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 72) {
                                this.f19967i = codedInputStream.readUInt64();
                            } else if (readTag == 82) {
                                Builder builder2 = this.f19972n != null ? (C7896a) this.f19972n.toBuilder() : null;
                                this.f19972n = (C7895c) codedInputStream.readMessage(C7895c.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19972n);
                                    this.f19972n = (C7895c) builder2.buildPartial();
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
                if (f19962p == null) {
                    synchronized (ReverseGeoCoderProto$Shape.class) {
                        if (f19962p == null) {
                            f19962p = new DefaultInstanceBasedParser(f19961o);
                        }
                    }
                }
                return f19962p;
            default:
                throw new UnsupportedOperationException();
        }
        return f19961o;
    }

    public double getAreaSqm() {
        return this.f19970l;
    }

    public C6950b0 getCentroid() {
        C6950b0 b0Var = this.f19971m;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public long getCountryId() {
        return this.f19967i;
    }

    public String getCountryIsoCode() {
        return this.f19966h;
    }

    public ByteString getCountryIsoCodeBytes() {
        return ByteString.copyFromUtf8(this.f19966h);
    }

    public long getId() {
        return this.f19964f;
    }

    public String getLocalizedName() {
        return this.f19969k;
    }

    public ByteString getLocalizedNameBytes() {
        return ByteString.copyFromUtf8(this.f19969k);
    }

    public C7893b getOuters(int i) {
        return (C7893b) this.f19968j.get(i);
    }

    public int getOutersCount() {
        return this.f19968j.size();
    }

    public List<C7893b> getOutersList() {
        return this.f19968j;
    }

    public C7895c getParentCountry() {
        C7895c cVar = this.f19972n;
        return cVar == null ? C7895c.getDefaultInstance() : cVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.f19965g != C7917e.UNUSED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f19965g) + 0 : 0;
        if (!this.f19969k.isEmpty()) {
            computeEnumSize += CodedOutputStream.computeStringSize(3, getLocalizedName());
        }
        double d = this.f19970l;
        if (d != 0.0d) {
            computeEnumSize += CodedOutputStream.computeDoubleSize(4, d);
        }
        if (this.f19971m != null) {
            computeEnumSize += CodedOutputStream.computeMessageSize(5, getCentroid());
        }
        long j = this.f19964f;
        if (j != 0) {
            computeEnumSize += CodedOutputStream.computeUInt64Size(6, j);
        }
        for (int i2 = 0; i2 < this.f19968j.size(); i2++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f19968j.get(i2));
        }
        if (!this.f19966h.isEmpty()) {
            computeEnumSize += CodedOutputStream.computeStringSize(8, getCountryIsoCode());
        }
        long j2 = this.f19967i;
        if (j2 != 0) {
            computeEnumSize += CodedOutputStream.computeUInt64Size(9, j2);
        }
        if (this.f19972n != null) {
            computeEnumSize += CodedOutputStream.computeMessageSize(10, getParentCountry());
        }
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    public C7917e getType() {
        C7917e a = C7917e.m18960a(this.f19965g);
        return a == null ? C7917e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f19965g;
    }

    public boolean hasCentroid() {
        return this.f19971m != null;
    }

    public boolean hasParentCountry() {
        return this.f19972n != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19965g != C7917e.UNUSED.getNumber()) {
            codedOutputStream.writeEnum(1, this.f19965g);
        }
        if (!this.f19969k.isEmpty()) {
            codedOutputStream.writeString(3, getLocalizedName());
        }
        double d = this.f19970l;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(4, d);
        }
        if (this.f19971m != null) {
            codedOutputStream.writeMessage(5, getCentroid());
        }
        long j = this.f19964f;
        if (j != 0) {
            codedOutputStream.writeUInt64(6, j);
        }
        for (int i = 0; i < this.f19968j.size(); i++) {
            codedOutputStream.writeMessage(7, (MessageLite) this.f19968j.get(i));
        }
        if (!this.f19966h.isEmpty()) {
            codedOutputStream.writeString(8, getCountryIsoCode());
        }
        long j2 = this.f19967i;
        if (j2 != 0) {
            codedOutputStream.writeUInt64(9, j2);
        }
        if (this.f19972n != null) {
            codedOutputStream.writeMessage(10, getParentCountry());
        }
    }
}
