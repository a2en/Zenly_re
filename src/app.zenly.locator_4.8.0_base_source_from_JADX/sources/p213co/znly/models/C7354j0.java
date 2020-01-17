package p213co.znly.models;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter.Converter;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7341i0.C7344b;

/* renamed from: co.znly.models.j0 */
public final class C7354j0 extends GeneratedMessageLite<C7354j0, C7357c> implements MediaProto$MediaOrBuilder {

    /* renamed from: v */
    private static final Converter<Integer, C7362f> f18306v = new C7355a();

    /* renamed from: w */
    private static final Converter<Integer, C7358d> f18307w = new C7356b();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final C7354j0 f18308x = new C7354j0();

    /* renamed from: y */
    private static volatile Parser<C7354j0> f18309y;

    /* renamed from: e */
    private int f18310e;

    /* renamed from: f */
    private String f18311f;

    /* renamed from: g */
    private int f18312g;

    /* renamed from: h */
    private C7341i0 f18313h;

    /* renamed from: i */
    private String f18314i;

    /* renamed from: j */
    private IntList f18315j = GeneratedMessageLite.emptyIntList();

    /* renamed from: k */
    private long f18316k;

    /* renamed from: l */
    private int f18317l;

    /* renamed from: m */
    private int f18318m;

    /* renamed from: n */
    private Timestamp f18319n;

    /* renamed from: o */
    private String f18320o;

    /* renamed from: p */
    private String f18321p;

    /* renamed from: q */
    private IntList f18322q;

    /* renamed from: r */
    private int f18323r;

    /* renamed from: s */
    private int f18324s;

    /* renamed from: t */
    private String f18325t;

    /* renamed from: u */
    private Timestamp f18326u;

    /* renamed from: co.znly.models.j0$a */
    class C7355a implements Converter<Integer, C7362f> {
        C7355a() {
        }

        /* renamed from: a */
        public C7362f convert(Integer num) {
            C7362f a = C7362f.m18058a(num.intValue());
            return a == null ? C7362f.UNRECOGNIZED : a;
        }
    }

    /* renamed from: co.znly.models.j0$b */
    class C7356b implements Converter<Integer, C7358d> {
        C7356b() {
        }

        /* renamed from: a */
        public C7358d convert(Integer num) {
            C7358d a = C7358d.m18056a(num.intValue());
            return a == null ? C7358d.UNRECOGNIZED : a;
        }
    }

    /* renamed from: co.znly.models.j0$c */
    public static final class C7357c extends Builder<C7354j0, C7357c> implements MediaProto$MediaOrBuilder {
        /* synthetic */ C7357c(C7332h0 h0Var) {
            this();
        }

        /* renamed from: a */
        public C7357c mo19256a(C7360e eVar) {
            copyOnWrite();
            ((C7354j0) this.instance).m18040a(eVar);
            return this;
        }

        /* renamed from: b */
        public C7357c mo19258b(int i) {
            copyOnWrite();
            ((C7354j0) this.instance).m18045b(i);
            return this;
        }

        public Timestamp getCreatedAt() {
            return ((C7354j0) this.instance).getCreatedAt();
        }

        public C7358d getEncodings(int i) {
            return ((C7354j0) this.instance).getEncodings(i);
        }

        public int getEncodingsCount() {
            return ((C7354j0) this.instance).getEncodingsCount();
        }

        public List<C7358d> getEncodingsList() {
            return ((C7354j0) this.instance).getEncodingsList();
        }

        public int getEncodingsValue(int i) {
            return ((C7354j0) this.instance).getEncodingsValue(i);
        }

        public List<Integer> getEncodingsValueList() {
            return Collections.unmodifiableList(((C7354j0) this.instance).getEncodingsValueList());
        }

        public C7341i0 getHash() {
            return ((C7354j0) this.instance).getHash();
        }

        public int getOriginalHeight() {
            return ((C7354j0) this.instance).getOriginalHeight();
        }

        public long getOriginalSizeBytes() {
            return ((C7354j0) this.instance).getOriginalSizeBytes();
        }

        public int getOriginalWidth() {
            return ((C7354j0) this.instance).getOriginalWidth();
        }

        public int getPreviewHeight() {
            return ((C7354j0) this.instance).getPreviewHeight();
        }

        public int getPreviewWidth() {
            return ((C7354j0) this.instance).getPreviewWidth();
        }

        public String getReplyTo() {
            return ((C7354j0) this.instance).getReplyTo();
        }

        public ByteString getReplyToBytes() {
            return ((C7354j0) this.instance).getReplyToBytes();
        }

        public C7360e getType() {
            return ((C7354j0) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7354j0) this.instance).getTypeValue();
        }

        public String getUploadFilepath() {
            return ((C7354j0) this.instance).getUploadFilepath();
        }

        public ByteString getUploadFilepathBytes() {
            return ((C7354j0) this.instance).getUploadFilepathBytes();
        }

        public String getUrlPrefix() {
            return ((C7354j0) this.instance).getUrlPrefix();
        }

        public ByteString getUrlPrefixBytes() {
            return ((C7354j0) this.instance).getUrlPrefixBytes();
        }

        public String getUserUuid() {
            return ((C7354j0) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7354j0) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((C7354j0) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7354j0) this.instance).getUuidBytes();
        }

        public Timestamp getValidUntil() {
            return ((C7354j0) this.instance).getValidUntil();
        }

        public C7362f getVariants(int i) {
            return ((C7354j0) this.instance).getVariants(i);
        }

        public int getVariantsCount() {
            return ((C7354j0) this.instance).getVariantsCount();
        }

        public List<C7362f> getVariantsList() {
            return ((C7354j0) this.instance).getVariantsList();
        }

        public int getVariantsValue(int i) {
            return ((C7354j0) this.instance).getVariantsValue(i);
        }

        public List<Integer> getVariantsValueList() {
            return Collections.unmodifiableList(((C7354j0) this.instance).getVariantsValueList());
        }

        public boolean hasCreatedAt() {
            return ((C7354j0) this.instance).hasCreatedAt();
        }

        public boolean hasHash() {
            return ((C7354j0) this.instance).hasHash();
        }

        public boolean hasValidUntil() {
            return ((C7354j0) this.instance).hasValidUntil();
        }

        private C7357c() {
            super(C7354j0.f18308x);
        }

        /* renamed from: a */
        public C7357c mo19255a(int i) {
            copyOnWrite();
            ((C7354j0) this.instance).m18039a(i);
            return this;
        }

        /* renamed from: b */
        public C7357c mo19259b(String str) {
            copyOnWrite();
            ((C7354j0) this.instance).m18048b(str);
            return this;
        }

        /* renamed from: a */
        public C7357c mo19257a(String str) {
            copyOnWrite();
            ((C7354j0) this.instance).m18044a(str);
            return this;
        }
    }

    /* renamed from: co.znly.models.j0$d */
    public enum C7358d implements EnumLite {
        ENCODING_UNKNOWN(0),
        ENCODING_JPG(1),
        ENCODING_PNG(2),
        ENCODING_MP4(10),
        ENCODING_MOV(11),
        ENCODING_MP3(20),
        ENCODING_WAV(21),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18336e;

        /* renamed from: co.znly.models.j0$d$a */
        class C7359a implements EnumLiteMap<C7358d> {
            C7359a() {
            }

            public C7358d findValueByNumber(int i) {
                return C7358d.m18056a(i);
            }
        }

        static {
            new C7359a();
        }

        private C7358d(int i) {
            this.f18336e = i;
        }

        /* renamed from: a */
        public static C7358d m18056a(int i) {
            if (i == 0) {
                return ENCODING_UNKNOWN;
            }
            if (i == 1) {
                return ENCODING_JPG;
            }
            if (i == 2) {
                return ENCODING_PNG;
            }
            if (i == 10) {
                return ENCODING_MP4;
            }
            if (i == 11) {
                return ENCODING_MOV;
            }
            if (i == 20) {
                return ENCODING_MP3;
            }
            if (i != 21) {
                return null;
            }
            return ENCODING_WAV;
        }

        public final int getNumber() {
            return this.f18336e;
        }
    }

    /* renamed from: co.znly.models.j0$e */
    public enum C7360e implements EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_IMAGE(1),
        TYPE_VIDEO(2),
        TYPE_AUDIO(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18343e;

        /* renamed from: co.znly.models.j0$e$a */
        class C7361a implements EnumLiteMap<C7360e> {
            C7361a() {
            }

            public C7360e findValueByNumber(int i) {
                return C7360e.m18057a(i);
            }
        }

        static {
            new C7361a();
        }

        private C7360e(int i) {
            this.f18343e = i;
        }

        /* renamed from: a */
        public static C7360e m18057a(int i) {
            if (i == 0) {
                return TYPE_UNKNOWN;
            }
            if (i == 1) {
                return TYPE_IMAGE;
            }
            if (i == 2) {
                return TYPE_VIDEO;
            }
            if (i != 3) {
                return null;
            }
            return TYPE_AUDIO;
        }

        public final int getNumber() {
            return this.f18343e;
        }
    }

    /* renamed from: co.znly.models.j0$f */
    public enum C7362f implements EnumLite {
        VARIANT_UNKNOWN(0),
        VARIANT_ORIGINAL(1),
        VARIANT_THUMBNAIL(2),
        VARIANT_MINI(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18350e;

        /* renamed from: co.znly.models.j0$f$a */
        class C7363a implements EnumLiteMap<C7362f> {
            C7363a() {
            }

            public C7362f findValueByNumber(int i) {
                return C7362f.m18058a(i);
            }
        }

        static {
            new C7363a();
        }

        private C7362f(int i) {
            this.f18350e = i;
        }

        /* renamed from: a */
        public static C7362f m18058a(int i) {
            if (i == 0) {
                return VARIANT_UNKNOWN;
            }
            if (i == 1) {
                return VARIANT_ORIGINAL;
            }
            if (i == 2) {
                return VARIANT_THUMBNAIL;
            }
            if (i != 3) {
                return null;
            }
            return VARIANT_MINI;
        }

        public final int getNumber() {
            return this.f18350e;
        }
    }

    static {
        f18308x.makeImmutable();
    }

    private C7354j0() {
        String str = "";
        this.f18311f = str;
        this.f18314i = str;
        this.f18320o = str;
        this.f18321p = str;
        this.f18322q = GeneratedMessageLite.emptyIntList();
        this.f18325t = str;
    }

    public static C7354j0 getDefaultInstance() {
        return f18308x;
    }

    public static C7357c newBuilder() {
        return (C7357c) f18308x.toBuilder();
    }

    public static C7354j0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C7354j0) GeneratedMessageLite.parseFrom(f18308x, bArr);
    }

    public static Parser<C7354j0> parser() {
        return f18308x.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7332h0.f18217a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7354j0();
            case 2:
                return f18308x;
            case 3:
                this.f18315j.makeImmutable();
                this.f18322q.makeImmutable();
                return null;
            case 4:
                return new C7357c(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7354j0 j0Var = (C7354j0) obj2;
                this.f18311f = visitor.visitString(!this.f18311f.isEmpty(), this.f18311f, !j0Var.f18311f.isEmpty(), j0Var.f18311f);
                this.f18312g = visitor.visitInt(this.f18312g != 0, this.f18312g, j0Var.f18312g != 0, j0Var.f18312g);
                this.f18313h = (C7341i0) visitor.visitMessage(this.f18313h, j0Var.f18313h);
                this.f18314i = visitor.visitString(!this.f18314i.isEmpty(), this.f18314i, !j0Var.f18314i.isEmpty(), j0Var.f18314i);
                this.f18315j = visitor.visitIntList(this.f18315j, j0Var.f18315j);
                this.f18316k = visitor.visitLong(this.f18316k != 0, this.f18316k, j0Var.f18316k != 0, j0Var.f18316k);
                this.f18317l = visitor.visitInt(this.f18317l != 0, this.f18317l, j0Var.f18317l != 0, j0Var.f18317l);
                this.f18318m = visitor.visitInt(this.f18318m != 0, this.f18318m, j0Var.f18318m != 0, j0Var.f18318m);
                this.f18319n = (Timestamp) visitor.visitMessage(this.f18319n, j0Var.f18319n);
                this.f18320o = visitor.visitString(!this.f18320o.isEmpty(), this.f18320o, !j0Var.f18320o.isEmpty(), j0Var.f18320o);
                this.f18321p = visitor.visitString(!this.f18321p.isEmpty(), this.f18321p, !j0Var.f18321p.isEmpty(), j0Var.f18321p);
                this.f18322q = visitor.visitIntList(this.f18322q, j0Var.f18322q);
                this.f18323r = visitor.visitInt(this.f18323r != 0, this.f18323r, j0Var.f18323r != 0, j0Var.f18323r);
                boolean z2 = this.f18324s != 0;
                int i = this.f18324s;
                if (j0Var.f18324s != 0) {
                    z = true;
                }
                this.f18324s = visitor.visitInt(z2, i, z, j0Var.f18324s);
                this.f18325t = visitor.visitString(!this.f18325t.isEmpty(), this.f18325t, !j0Var.f18325t.isEmpty(), j0Var.f18325t);
                this.f18326u = (Timestamp) visitor.visitMessage(this.f18326u, j0Var.f18326u);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18310e |= j0Var.f18310e;
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
                                this.f18311f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 16:
                                this.f18312g = codedInputStream.readEnum();
                                break;
                            case 26:
                                Builder builder = this.f18313h != null ? (C7344b) this.f18313h.toBuilder() : null;
                                this.f18313h = (C7341i0) codedInputStream.readMessage(C7341i0.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f18313h);
                                    this.f18313h = (C7341i0) builder.buildPartial();
                                    break;
                                }
                            case 34:
                                this.f18314i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 48:
                                this.f18316k = codedInputStream.readInt64();
                                break;
                            case 56:
                                this.f18317l = codedInputStream.readInt32();
                                break;
                            case 64:
                                this.f18318m = codedInputStream.readInt32();
                                break;
                            case 74:
                                Builder builder2 = this.f18319n != null ? (Timestamp.Builder) this.f18319n.toBuilder() : null;
                                this.f18319n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f18319n);
                                    this.f18319n = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 80:
                                if (!this.f18315j.isModifiable()) {
                                    this.f18315j = GeneratedMessageLite.mutableCopy(this.f18315j);
                                }
                                this.f18315j.addInt(codedInputStream.readEnum());
                                break;
                            case 82:
                                if (!this.f18315j.isModifiable()) {
                                    this.f18315j = GeneratedMessageLite.mutableCopy(this.f18315j);
                                }
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f18315j.addInt(codedInputStream.readEnum());
                                }
                                codedInputStream.popLimit(pushLimit);
                                break;
                            case 90:
                                this.f18320o = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                this.f18321p = codedInputStream.readStringRequireUtf8();
                                break;
                            case 104:
                                if (!this.f18322q.isModifiable()) {
                                    this.f18322q = GeneratedMessageLite.mutableCopy(this.f18322q);
                                }
                                this.f18322q.addInt(codedInputStream.readEnum());
                                break;
                            case 106:
                                if (!this.f18322q.isModifiable()) {
                                    this.f18322q = GeneratedMessageLite.mutableCopy(this.f18322q);
                                }
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f18322q.addInt(codedInputStream.readEnum());
                                }
                                codedInputStream.popLimit(pushLimit2);
                                break;
                            case 112:
                                this.f18323r = codedInputStream.readInt32();
                                break;
                            case 120:
                                this.f18324s = codedInputStream.readInt32();
                                break;
                            case 130:
                                this.f18325t = codedInputStream.readStringRequireUtf8();
                                break;
                            case 138:
                                Builder builder3 = this.f18326u != null ? (Timestamp.Builder) this.f18326u.toBuilder() : null;
                                this.f18326u = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f18326u);
                                    this.f18326u = (Timestamp) builder3.buildPartial();
                                    break;
                                }
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
                if (f18309y == null) {
                    synchronized (C7354j0.class) {
                        if (f18309y == null) {
                            f18309y = new DefaultInstanceBasedParser(f18308x);
                        }
                    }
                }
                return f18309y;
            default:
                throw new UnsupportedOperationException();
        }
        return f18308x;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f18319n;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C7358d getEncodings(int i) {
        return (C7358d) f18307w.convert(Integer.valueOf(this.f18322q.getInt(i)));
    }

    public int getEncodingsCount() {
        return this.f18322q.size();
    }

    public List<C7358d> getEncodingsList() {
        return new ListAdapter(this.f18322q, f18307w);
    }

    public int getEncodingsValue(int i) {
        return this.f18322q.getInt(i);
    }

    public List<Integer> getEncodingsValueList() {
        return this.f18322q;
    }

    public C7341i0 getHash() {
        C7341i0 i0Var = this.f18313h;
        return i0Var == null ? C7341i0.getDefaultInstance() : i0Var;
    }

    public int getOriginalHeight() {
        return this.f18318m;
    }

    public long getOriginalSizeBytes() {
        return this.f18316k;
    }

    public int getOriginalWidth() {
        return this.f18317l;
    }

    public int getPreviewHeight() {
        return this.f18324s;
    }

    public int getPreviewWidth() {
        return this.f18323r;
    }

    public String getReplyTo() {
        return this.f18325t;
    }

    public ByteString getReplyToBytes() {
        return ByteString.copyFromUtf8(this.f18325t);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18311f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f18312g != C7360e.TYPE_UNKNOWN.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(2, this.f18312g);
        }
        if (this.f18313h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getHash());
        }
        if (!this.f18314i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getUserUuid());
        }
        long j = this.f18316k;
        if (j != 0) {
            computeStringSize += CodedOutputStream.computeInt64Size(6, j);
        }
        int i2 = this.f18317l;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(7, i2);
        }
        int i3 = this.f18318m;
        if (i3 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(8, i3);
        }
        if (this.f18319n != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(9, getCreatedAt());
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f18315j.size(); i5++) {
            i4 += CodedOutputStream.computeEnumSizeNoTag(this.f18315j.getInt(i5));
        }
        int size = computeStringSize + i4 + (this.f18315j.size() * 1);
        if (!this.f18320o.isEmpty()) {
            size += CodedOutputStream.computeStringSize(11, getUploadFilepath());
        }
        if (!this.f18321p.isEmpty()) {
            size += CodedOutputStream.computeStringSize(12, getUrlPrefix());
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f18322q.size(); i7++) {
            i6 += CodedOutputStream.computeEnumSizeNoTag(this.f18322q.getInt(i7));
        }
        int size2 = size + i6 + (this.f18322q.size() * 1);
        int i8 = this.f18323r;
        if (i8 != 0) {
            size2 += CodedOutputStream.computeInt32Size(14, i8);
        }
        int i9 = this.f18324s;
        if (i9 != 0) {
            size2 += CodedOutputStream.computeInt32Size(15, i9);
        }
        if (!this.f18325t.isEmpty()) {
            size2 += CodedOutputStream.computeStringSize(16, getReplyTo());
        }
        if (this.f18326u != null) {
            size2 += CodedOutputStream.computeMessageSize(17, getValidUntil());
        }
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public C7360e getType() {
        C7360e a = C7360e.m18057a(this.f18312g);
        return a == null ? C7360e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18312g;
    }

    public String getUploadFilepath() {
        return this.f18320o;
    }

    public ByteString getUploadFilepathBytes() {
        return ByteString.copyFromUtf8(this.f18320o);
    }

    public String getUrlPrefix() {
        return this.f18321p;
    }

    public ByteString getUrlPrefixBytes() {
        return ByteString.copyFromUtf8(this.f18321p);
    }

    public String getUserUuid() {
        return this.f18314i;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18314i);
    }

    public String getUuid() {
        return this.f18311f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f18311f);
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f18326u;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C7362f getVariants(int i) {
        return (C7362f) f18306v.convert(Integer.valueOf(this.f18315j.getInt(i)));
    }

    public int getVariantsCount() {
        return this.f18315j.size();
    }

    public List<C7362f> getVariantsList() {
        return new ListAdapter(this.f18315j, f18306v);
    }

    public int getVariantsValue(int i) {
        return this.f18315j.getInt(i);
    }

    public List<Integer> getVariantsValueList() {
        return this.f18315j;
    }

    public boolean hasCreatedAt() {
        return this.f18319n != null;
    }

    public boolean hasHash() {
        return this.f18313h != null;
    }

    public boolean hasValidUntil() {
        return this.f18326u != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (!this.f18311f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f18312g != C7360e.TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(2, this.f18312g);
        }
        if (this.f18313h != null) {
            codedOutputStream.writeMessage(3, getHash());
        }
        if (!this.f18314i.isEmpty()) {
            codedOutputStream.writeString(4, getUserUuid());
        }
        long j = this.f18316k;
        if (j != 0) {
            codedOutputStream.writeInt64(6, j);
        }
        int i = this.f18317l;
        if (i != 0) {
            codedOutputStream.writeInt32(7, i);
        }
        int i2 = this.f18318m;
        if (i2 != 0) {
            codedOutputStream.writeInt32(8, i2);
        }
        if (this.f18319n != null) {
            codedOutputStream.writeMessage(9, getCreatedAt());
        }
        for (int i3 = 0; i3 < this.f18315j.size(); i3++) {
            codedOutputStream.writeEnum(10, this.f18315j.getInt(i3));
        }
        if (!this.f18320o.isEmpty()) {
            codedOutputStream.writeString(11, getUploadFilepath());
        }
        if (!this.f18321p.isEmpty()) {
            codedOutputStream.writeString(12, getUrlPrefix());
        }
        for (int i4 = 0; i4 < this.f18322q.size(); i4++) {
            codedOutputStream.writeEnum(13, this.f18322q.getInt(i4));
        }
        int i5 = this.f18323r;
        if (i5 != 0) {
            codedOutputStream.writeInt32(14, i5);
        }
        int i6 = this.f18324s;
        if (i6 != 0) {
            codedOutputStream.writeInt32(15, i6);
        }
        if (!this.f18325t.isEmpty()) {
            codedOutputStream.writeString(16, getReplyTo());
        }
        if (this.f18326u != null) {
            codedOutputStream.writeMessage(17, getValidUntil());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m18045b(int i) {
        this.f18317l = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m18048b(String str) {
        if (str != null) {
            this.f18320o = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18040a(C7360e eVar) {
        if (eVar != null) {
            this.f18312g = eVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18039a(int i) {
        this.f18318m = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18044a(String str) {
        if (str != null) {
            this.f18325t = str;
            return;
        }
        throw new NullPointerException();
    }
}
