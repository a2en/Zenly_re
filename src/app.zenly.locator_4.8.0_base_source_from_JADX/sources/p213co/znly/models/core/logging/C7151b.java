package p213co.znly.models.core.logging;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MapEntryLite;
import p213co.znly.core.vendor.com.google.protobuf.MapFieldLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;

/* renamed from: co.znly.models.core.logging.b */
public final class C7151b extends GeneratedMessageLite<C7151b, C7152a> implements LoggingProto$LogMessageOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7151b f17710j = new C7151b();

    /* renamed from: k */
    private static volatile Parser<C7151b> f17711k;

    /* renamed from: e */
    private int f17712e;

    /* renamed from: f */
    private Timestamp f17713f;

    /* renamed from: g */
    private int f17714g;

    /* renamed from: h */
    private MapFieldLite<String, String> f17715h = MapFieldLite.emptyMapField();

    /* renamed from: i */
    private String f17716i = "";

    /* renamed from: co.znly.models.core.logging.b$a */
    public static final class C7152a extends Builder<C7151b, C7152a> implements LoggingProto$LogMessageOrBuilder {
        /* synthetic */ C7152a(C7150a aVar) {
            this();
        }

        /* renamed from: a */
        public C7152a mo19141a(C7154c cVar) {
            copyOnWrite();
            ((C7151b) this.instance).m17838a(cVar);
            return this;
        }

        public boolean containsFields(String str) {
            if (str != null) {
                return ((C7151b) this.instance).getFieldsMap().containsKey(str);
            }
            throw new NullPointerException();
        }

        @Deprecated
        public Map<String, String> getFields() {
            return getFieldsMap();
        }

        public int getFieldsCount() {
            return ((C7151b) this.instance).getFieldsMap().size();
        }

        public Map<String, String> getFieldsMap() {
            return Collections.unmodifiableMap(((C7151b) this.instance).getFieldsMap());
        }

        public String getFieldsOrDefault(String str, String str2) {
            if (str != null) {
                Map fieldsMap = ((C7151b) this.instance).getFieldsMap();
                return fieldsMap.containsKey(str) ? (String) fieldsMap.get(str) : str2;
            }
            throw new NullPointerException();
        }

        public String getFieldsOrThrow(String str) {
            if (str != null) {
                Map fieldsMap = ((C7151b) this.instance).getFieldsMap();
                if (fieldsMap.containsKey(str)) {
                    return (String) fieldsMap.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public C7154c getLevel() {
            return ((C7151b) this.instance).getLevel();
        }

        public int getLevelValue() {
            return ((C7151b) this.instance).getLevelValue();
        }

        public String getMessage() {
            return ((C7151b) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C7151b) this.instance).getMessageBytes();
        }

        public Timestamp getTime() {
            return ((C7151b) this.instance).getTime();
        }

        public boolean hasTime() {
            return ((C7151b) this.instance).hasTime();
        }

        private C7152a() {
            super(C7151b.f17710j);
        }

        /* renamed from: a */
        public C7152a mo19143a(Map<String, String> map) {
            copyOnWrite();
            ((C7151b) this.instance).m17836a().putAll(map);
            return this;
        }

        /* renamed from: a */
        public C7152a mo19142a(String str) {
            copyOnWrite();
            ((C7151b) this.instance).m17841a(str);
            return this;
        }
    }

    /* renamed from: co.znly.models.core.logging.b$b */
    private static final class C7153b {

        /* renamed from: a */
        static final MapEntryLite<String, String> f17717a;

        static {
            FieldType fieldType = FieldType.STRING;
            String str = "";
            f17717a = MapEntryLite.newDefaultInstance(fieldType, str, fieldType, str);
        }
    }

    /* renamed from: co.znly.models.core.logging.b$c */
    public enum C7154c implements EnumLite {
        LEVEL_PANIC(0),
        LEVEL_FATAL(1),
        LEVEL_ERROR(2),
        LEVEL_WARN(3),
        LEVEL_INFO(4),
        LEVEL_DEBUG(5),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17726e;

        /* renamed from: co.znly.models.core.logging.b$c$a */
        class C7155a implements EnumLiteMap<C7154c> {
            C7155a() {
            }

            public C7154c findValueByNumber(int i) {
                return C7154c.m17847a(i);
            }
        }

        static {
            new C7155a();
        }

        private C7154c(int i) {
            this.f17726e = i;
        }

        /* renamed from: a */
        public static C7154c m17847a(int i) {
            if (i == 0) {
                return LEVEL_PANIC;
            }
            if (i == 1) {
                return LEVEL_FATAL;
            }
            if (i == 2) {
                return LEVEL_ERROR;
            }
            if (i == 3) {
                return LEVEL_WARN;
            }
            if (i == 4) {
                return LEVEL_INFO;
            }
            if (i != 5) {
                return null;
            }
            return LEVEL_DEBUG;
        }

        public final int getNumber() {
            return this.f17726e;
        }
    }

    static {
        f17710j.makeImmutable();
    }

    private C7151b() {
    }

    /* renamed from: b */
    private MapFieldLite<String, String> m17842b() {
        return this.f17715h;
    }

    /* renamed from: c */
    private MapFieldLite<String, String> m17843c() {
        if (!this.f17715h.isMutable()) {
            this.f17715h = this.f17715h.mutableCopy();
        }
        return this.f17715h;
    }

    public static C7152a newBuilder() {
        return (C7152a) f17710j.toBuilder();
    }

    public boolean containsFields(String str) {
        if (str != null) {
            return m17842b().containsKey(str);
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7150a.f17709a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7151b();
            case 2:
                return f17710j;
            case 3:
                this.f17715h.makeImmutable();
                return null;
            case 4:
                return new C7152a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7151b bVar = (C7151b) obj2;
                this.f17713f = (Timestamp) visitor.visitMessage(this.f17713f, bVar.f17713f);
                boolean z2 = this.f17714g != 0;
                int i = this.f17714g;
                if (bVar.f17714g != 0) {
                    z = true;
                }
                this.f17714g = visitor.visitInt(z2, i, z, bVar.f17714g);
                this.f17715h = visitor.visitMap(this.f17715h, bVar.m17842b());
                this.f17716i = visitor.visitString(!this.f17716i.isEmpty(), this.f17716i, !bVar.f17716i.isEmpty(), bVar.f17716i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17712e |= bVar.f17712e;
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
                                Builder builder = this.f17713f != null ? (Timestamp.Builder) this.f17713f.toBuilder() : null;
                                this.f17713f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17713f);
                                    this.f17713f = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f17714g = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                if (!this.f17715h.isMutable()) {
                                    this.f17715h = this.f17715h.mutableCopy();
                                }
                                C7153b.f17717a.parseInto(this.f17715h, codedInputStream, extensionRegistryLite);
                            } else if (readTag == 34) {
                                this.f17716i = codedInputStream.readStringRequireUtf8();
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
                if (f17711k == null) {
                    synchronized (C7151b.class) {
                        if (f17711k == null) {
                            f17711k = new DefaultInstanceBasedParser(f17710j);
                        }
                    }
                }
                return f17711k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17710j;
    }

    @Deprecated
    public Map<String, String> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return m17842b().size();
    }

    public Map<String, String> getFieldsMap() {
        return Collections.unmodifiableMap(m17842b());
    }

    public String getFieldsOrDefault(String str, String str2) {
        if (str != null) {
            MapFieldLite b = m17842b();
            return b.containsKey(str) ? (String) b.get(str) : str2;
        }
        throw new NullPointerException();
    }

    public String getFieldsOrThrow(String str) {
        if (str != null) {
            MapFieldLite b = m17842b();
            if (b.containsKey(str)) {
                return (String) b.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    public C7154c getLevel() {
        C7154c a = C7154c.m17847a(this.f17714g);
        return a == null ? C7154c.UNRECOGNIZED : a;
    }

    public int getLevelValue() {
        return this.f17714g;
    }

    public String getMessage() {
        return this.f17716i;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f17716i);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17713f != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getTime());
        }
        if (this.f17714g != C7154c.LEVEL_PANIC.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f17714g);
        }
        for (Entry entry : m17842b().entrySet()) {
            i2 += C7153b.f17717a.computeMessageSize(3, entry.getKey(), entry.getValue());
        }
        if (!this.f17716i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getTime() {
        Timestamp timestamp = this.f17713f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasTime() {
        return this.f17713f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17713f != null) {
            codedOutputStream.writeMessage(1, getTime());
        }
        if (this.f17714g != C7154c.LEVEL_PANIC.getNumber()) {
            codedOutputStream.writeEnum(2, this.f17714g);
        }
        for (Entry entry : m17842b().entrySet()) {
            C7153b.f17717a.serializeTo(codedOutputStream, 3, entry.getKey(), entry.getValue());
        }
        if (!this.f17716i.isEmpty()) {
            codedOutputStream.writeString(4, getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17838a(C7154c cVar) {
        if (cVar != null) {
            this.f17714g = cVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m17836a() {
        return m17843c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17841a(String str) {
        if (str != null) {
            this.f17716i = str;
            return;
        }
        throw new NullPointerException();
    }
}
