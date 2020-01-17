package p213co.znly.models;

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
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MapEntryLite;
import p213co.znly.core.vendor.com.google.protobuf.MapFieldLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;

/* renamed from: co.znly.models.s2 */
public final class C7468s2 extends GeneratedMessageLite<C7468s2, C7470b> implements SystemProto$SpanContextOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C7468s2 f18724m = new C7468s2();

    /* renamed from: n */
    private static volatile Parser<C7468s2> f18725n;

    /* renamed from: e */
    private int f18726e;

    /* renamed from: f */
    private long f18727f;

    /* renamed from: g */
    private ByteString f18728g = ByteString.EMPTY;

    /* renamed from: h */
    private long f18729h;

    /* renamed from: i */
    private long f18730i;

    /* renamed from: j */
    private long f18731j;

    /* renamed from: k */
    private boolean f18732k;

    /* renamed from: l */
    private MapFieldLite<String, String> f18733l = MapFieldLite.emptyMapField();

    /* renamed from: co.znly.models.s2$a */
    private static final class C7469a {

        /* renamed from: a */
        static final MapEntryLite<String, String> f18734a;

        static {
            FieldType fieldType = FieldType.STRING;
            String str = "";
            f18734a = MapEntryLite.newDefaultInstance(fieldType, str, fieldType, str);
        }
    }

    /* renamed from: co.znly.models.s2$b */
    public static final class C7470b extends Builder<C7468s2, C7470b> implements SystemProto$SpanContextOrBuilder {
        /* synthetic */ C7470b(C7449q2 q2Var) {
            this();
        }

        public boolean containsBaggage(String str) {
            if (str != null) {
                return ((C7468s2) this.instance).getBaggageMap().containsKey(str);
            }
            throw new NullPointerException();
        }

        @Deprecated
        public Map<String, String> getBaggage() {
            return getBaggageMap();
        }

        public int getBaggageCount() {
            return ((C7468s2) this.instance).getBaggageMap().size();
        }

        public Map<String, String> getBaggageMap() {
            return Collections.unmodifiableMap(((C7468s2) this.instance).getBaggageMap());
        }

        public String getBaggageOrDefault(String str, String str2) {
            if (str != null) {
                Map baggageMap = ((C7468s2) this.instance).getBaggageMap();
                return baggageMap.containsKey(str) ? (String) baggageMap.get(str) : str2;
            }
            throw new NullPointerException();
        }

        public String getBaggageOrThrow(String str) {
            if (str != null) {
                Map baggageMap = ((C7468s2) this.instance).getBaggageMap();
                if (baggageMap.containsKey(str)) {
                    return (String) baggageMap.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public long getFlags() {
            return ((C7468s2) this.instance).getFlags();
        }

        public long getParentSpanId() {
            return ((C7468s2) this.instance).getParentSpanId();
        }

        public boolean getSampled() {
            return ((C7468s2) this.instance).getSampled();
        }

        public long getSpanId() {
            return ((C7468s2) this.instance).getSpanId();
        }

        public long getTraceId() {
            return ((C7468s2) this.instance).getTraceId();
        }

        public ByteString getTraceIdBinary() {
            return ((C7468s2) this.instance).getTraceIdBinary();
        }

        private C7470b() {
            super(C7468s2.f18724m);
        }
    }

    static {
        f18724m.makeImmutable();
    }

    private C7468s2() {
    }

    /* renamed from: b */
    private MapFieldLite<String, String> m18108b() {
        return this.f18733l;
    }

    public static C7468s2 getDefaultInstance() {
        return f18724m;
    }

    public static Parser<C7468s2> parser() {
        return f18724m.getParserForType();
    }

    public boolean containsBaggage(String str) {
        if (str != null) {
            return m18108b().containsKey(str);
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7449q2.f18637a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7468s2();
            case 2:
                return f18724m;
            case 3:
                this.f18733l.makeImmutable();
                return null;
            case 4:
                return new C7470b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7468s2 s2Var = (C7468s2) obj2;
                this.f18727f = visitor.visitLong(this.f18727f != 0, this.f18727f, s2Var.f18727f != 0, s2Var.f18727f);
                this.f18728g = visitor.visitByteString(this.f18728g != ByteString.EMPTY, this.f18728g, s2Var.f18728g != ByteString.EMPTY, s2Var.f18728g);
                this.f18729h = visitor.visitLong(this.f18729h != 0, this.f18729h, s2Var.f18729h != 0, s2Var.f18729h);
                this.f18730i = visitor.visitLong(this.f18730i != 0, this.f18730i, s2Var.f18730i != 0, s2Var.f18730i);
                this.f18731j = visitor.visitLong(this.f18731j != 0, this.f18731j, s2Var.f18731j != 0, s2Var.f18731j);
                boolean z2 = this.f18732k;
                boolean z3 = s2Var.f18732k;
                this.f18732k = visitor.visitBoolean(z2, z2, z3, z3);
                this.f18733l = visitor.visitMap(this.f18733l, s2Var.m18108b());
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18726e |= s2Var.f18726e;
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
                                this.f18727f = codedInputStream.readUInt64();
                            } else if (readTag == 16) {
                                this.f18729h = codedInputStream.readUInt64();
                            } else if (readTag == 24) {
                                this.f18730i = codedInputStream.readUInt64();
                            } else if (readTag == 32) {
                                this.f18731j = codedInputStream.readUInt64();
                            } else if (readTag == 40) {
                                this.f18732k = codedInputStream.readBool();
                            } else if (readTag == 50) {
                                if (!this.f18733l.isMutable()) {
                                    this.f18733l = this.f18733l.mutableCopy();
                                }
                                C7469a.f18734a.parseInto(this.f18733l, codedInputStream, extensionRegistryLite);
                            } else if (readTag == 58) {
                                this.f18728g = codedInputStream.readBytes();
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
                if (f18725n == null) {
                    synchronized (C7468s2.class) {
                        if (f18725n == null) {
                            f18725n = new DefaultInstanceBasedParser(f18724m);
                        }
                    }
                }
                return f18725n;
            default:
                throw new UnsupportedOperationException();
        }
        return f18724m;
    }

    @Deprecated
    public Map<String, String> getBaggage() {
        return getBaggageMap();
    }

    public int getBaggageCount() {
        return m18108b().size();
    }

    public Map<String, String> getBaggageMap() {
        return Collections.unmodifiableMap(m18108b());
    }

    public String getBaggageOrDefault(String str, String str2) {
        if (str != null) {
            MapFieldLite b = m18108b();
            return b.containsKey(str) ? (String) b.get(str) : str2;
        }
        throw new NullPointerException();
    }

    public String getBaggageOrThrow(String str) {
        if (str != null) {
            MapFieldLite b = m18108b();
            if (b.containsKey(str)) {
                return (String) b.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    public long getFlags() {
        return this.f18731j;
    }

    public long getParentSpanId() {
        return this.f18730i;
    }

    public boolean getSampled() {
        return this.f18732k;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f18727f;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
        }
        long j2 = this.f18729h;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(2, j2);
        }
        long j3 = this.f18730i;
        if (j3 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(3, j3);
        }
        long j4 = this.f18731j;
        if (j4 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(4, j4);
        }
        boolean z = this.f18732k;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(5, z);
        }
        for (Entry entry : m18108b().entrySet()) {
            i2 += C7469a.f18734a.computeMessageSize(6, entry.getKey(), entry.getValue());
        }
        if (!this.f18728g.isEmpty()) {
            i2 += CodedOutputStream.computeBytesSize(7, this.f18728g);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getSpanId() {
        return this.f18729h;
    }

    public long getTraceId() {
        return this.f18727f;
    }

    public ByteString getTraceIdBinary() {
        return this.f18728g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f18727f;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        long j2 = this.f18729h;
        if (j2 != 0) {
            codedOutputStream.writeUInt64(2, j2);
        }
        long j3 = this.f18730i;
        if (j3 != 0) {
            codedOutputStream.writeUInt64(3, j3);
        }
        long j4 = this.f18731j;
        if (j4 != 0) {
            codedOutputStream.writeUInt64(4, j4);
        }
        boolean z = this.f18732k;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        for (Entry entry : m18108b().entrySet()) {
            C7469a.f18734a.serializeTo(codedOutputStream, 6, entry.getKey(), entry.getValue());
        }
        if (!this.f18728g.isEmpty()) {
            codedOutputStream.writeBytes(7, this.f18728g);
        }
    }
}
