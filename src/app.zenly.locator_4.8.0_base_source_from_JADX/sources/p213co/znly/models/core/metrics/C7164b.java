package p213co.znly.models.core.metrics;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MapEntryLite;
import p213co.znly.core.vendor.com.google.protobuf.MapFieldLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;

/* renamed from: co.znly.models.core.metrics.b */
public final class C7164b extends GeneratedMessageLite<C7164b, C7165a> implements MetricsProto$MetricOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7164b f17741j = new C7164b();

    /* renamed from: k */
    private static volatile Parser<C7164b> f17742k;

    /* renamed from: e */
    private int f17743e;

    /* renamed from: f */
    private int f17744f = 0;

    /* renamed from: g */
    private Object f17745g;

    /* renamed from: h */
    private String f17746h = "";

    /* renamed from: i */
    private MapFieldLite<String, String> f17747i = MapFieldLite.emptyMapField();

    /* renamed from: co.znly.models.core.metrics.b$a */
    public static final class C7165a extends Builder<C7164b, C7165a> implements MetricsProto$MetricOrBuilder {
        /* synthetic */ C7165a(C7163a aVar) {
            this();
        }

        public boolean containsMeta(String str) {
            if (str != null) {
                return ((C7164b) this.instance).getMetaMap().containsKey(str);
            }
            throw new NullPointerException();
        }

        public float getFloat() {
            return ((C7164b) this.instance).getFloat();
        }

        public long getInt() {
            return ((C7164b) this.instance).getInt();
        }

        public String getKey() {
            return ((C7164b) this.instance).getKey();
        }

        public ByteString getKeyBytes() {
            return ((C7164b) this.instance).getKeyBytes();
        }

        @Deprecated
        public Map<String, String> getMeta() {
            return getMetaMap();
        }

        public int getMetaCount() {
            return ((C7164b) this.instance).getMetaMap().size();
        }

        public Map<String, String> getMetaMap() {
            return Collections.unmodifiableMap(((C7164b) this.instance).getMetaMap());
        }

        public String getMetaOrDefault(String str, String str2) {
            if (str != null) {
                Map metaMap = ((C7164b) this.instance).getMetaMap();
                return metaMap.containsKey(str) ? (String) metaMap.get(str) : str2;
            }
            throw new NullPointerException();
        }

        public String getMetaOrThrow(String str) {
            if (str != null) {
                Map metaMap = ((C7164b) this.instance).getMetaMap();
                if (metaMap.containsKey(str)) {
                    return (String) metaMap.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public C7167c getValueCase() {
            return ((C7164b) this.instance).getValueCase();
        }

        private C7165a() {
            super(C7164b.f17741j);
        }
    }

    /* renamed from: co.znly.models.core.metrics.b$b */
    private static final class C7166b {

        /* renamed from: a */
        static final MapEntryLite<String, String> f17748a;

        static {
            FieldType fieldType = FieldType.STRING;
            String str = "";
            f17748a = MapEntryLite.newDefaultInstance(fieldType, str, fieldType, str);
        }
    }

    /* renamed from: co.znly.models.core.metrics.b$c */
    public enum C7167c implements EnumLite {
        INT(3),
        FLOAT(4),
        VALUE_NOT_SET(0);
        

        /* renamed from: e */
        private final int f17753e;

        private C7167c(int i) {
            this.f17753e = i;
        }

        /* renamed from: a */
        public static C7167c m17859a(int i) {
            if (i == 0) {
                return VALUE_NOT_SET;
            }
            if (i == 3) {
                return INT;
            }
            if (i != 4) {
                return null;
            }
            return FLOAT;
        }

        public int getNumber() {
            return this.f17753e;
        }
    }

    static {
        f17741j.makeImmutable();
    }

    private C7164b() {
    }

    /* renamed from: b */
    private MapFieldLite<String, String> m17858b() {
        return this.f17747i;
    }

    public boolean containsMeta(String str) {
        if (str != null) {
            return m17858b().containsKey(str);
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7163a.f17739a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7164b();
            case 2:
                return f17741j;
            case 3:
                this.f17747i.makeImmutable();
                return null;
            case 4:
                return new C7165a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7164b bVar = (C7164b) obj2;
                this.f17746h = visitor.visitString(!this.f17746h.isEmpty(), this.f17746h, !bVar.f17746h.isEmpty(), bVar.f17746h);
                this.f17747i = visitor.visitMap(this.f17747i, bVar.m17858b());
                int i = C7163a.f17740b[bVar.getValueCase().ordinal()];
                if (i == 1) {
                    if (this.f17744f == 3) {
                        z = true;
                    }
                    this.f17745g = visitor.visitOneofLong(z, this.f17745g, bVar.f17745g);
                } else if (i == 2) {
                    if (this.f17744f == 4) {
                        z = true;
                    }
                    this.f17745g = visitor.visitOneofFloat(z, this.f17745g, bVar.f17745g);
                } else if (i == 3) {
                    if (this.f17744f != 0) {
                        z = true;
                    }
                    visitor.visitOneofNotSet(z);
                }
                if (visitor == MergeFromVisitor.INSTANCE) {
                    int i2 = bVar.f17744f;
                    if (i2 != 0) {
                        this.f17744f = i2;
                    }
                    this.f17743e |= bVar.f17743e;
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
                                this.f17746h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!this.f17747i.isMutable()) {
                                    this.f17747i = this.f17747i.mutableCopy();
                                }
                                C7166b.f17748a.parseInto(this.f17747i, codedInputStream, extensionRegistryLite);
                            } else if (readTag == 24) {
                                this.f17744f = 3;
                                this.f17745g = Long.valueOf(codedInputStream.readInt64());
                            } else if (readTag == 37) {
                                this.f17744f = 4;
                                this.f17745g = Float.valueOf(codedInputStream.readFloat());
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
                if (f17742k == null) {
                    synchronized (C7164b.class) {
                        if (f17742k == null) {
                            f17742k = new DefaultInstanceBasedParser(f17741j);
                        }
                    }
                }
                return f17742k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17741j;
    }

    public float getFloat() {
        if (this.f17744f == 4) {
            return ((Float) this.f17745g).floatValue();
        }
        return 0.0f;
    }

    public long getInt() {
        if (this.f17744f == 3) {
            return ((Long) this.f17745g).longValue();
        }
        return 0;
    }

    public String getKey() {
        return this.f17746h;
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.f17746h);
    }

    @Deprecated
    public Map<String, String> getMeta() {
        return getMetaMap();
    }

    public int getMetaCount() {
        return m17858b().size();
    }

    public Map<String, String> getMetaMap() {
        return Collections.unmodifiableMap(m17858b());
    }

    public String getMetaOrDefault(String str, String str2) {
        if (str != null) {
            MapFieldLite b = m17858b();
            return b.containsKey(str) ? (String) b.get(str) : str2;
        }
        throw new NullPointerException();
    }

    public String getMetaOrThrow(String str) {
        if (str != null) {
            MapFieldLite b = m17858b();
            if (b.containsKey(str)) {
                return (String) b.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17746h.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getKey());
        }
        for (Entry entry : m17858b().entrySet()) {
            i2 += C7166b.f17748a.computeMessageSize(2, entry.getKey(), entry.getValue());
        }
        if (this.f17744f == 3) {
            i2 += CodedOutputStream.computeInt64Size(3, ((Long) this.f17745g).longValue());
        }
        if (this.f17744f == 4) {
            i2 += CodedOutputStream.computeFloatSize(4, ((Float) this.f17745g).floatValue());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7167c getValueCase() {
        return C7167c.m17859a(this.f17744f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17746h.isEmpty()) {
            codedOutputStream.writeString(1, getKey());
        }
        for (Entry entry : m17858b().entrySet()) {
            C7166b.f17748a.serializeTo(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        if (this.f17744f == 3) {
            codedOutputStream.writeInt64(3, ((Long) this.f17745g).longValue());
        }
        if (this.f17744f == 4) {
            codedOutputStream.writeFloat(4, ((Float) this.f17745g).floatValue());
        }
    }
}
