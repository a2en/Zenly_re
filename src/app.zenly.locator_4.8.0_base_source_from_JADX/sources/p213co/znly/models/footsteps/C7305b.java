package p213co.znly.models.footsteps;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.footsteps.b */
public final class C7305b extends GeneratedMessageLite<C7305b, C7306a> implements FootstepsProto$LocalityOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C7305b f18132n = new C7305b();

    /* renamed from: o */
    private static volatile Parser<C7305b> f18133o;

    /* renamed from: e */
    private String f18134e;

    /* renamed from: f */
    private String f18135f;

    /* renamed from: g */
    private Timestamp f18136g;

    /* renamed from: h */
    private int f18137h;

    /* renamed from: i */
    private Duration f18138i;

    /* renamed from: j */
    private int f18139j;

    /* renamed from: k */
    private C6950b0 f18140k;

    /* renamed from: l */
    private String f18141l;

    /* renamed from: m */
    private String f18142m;

    /* renamed from: co.znly.models.footsteps.b$a */
    public static final class C7306a extends Builder<C7305b, C7306a> implements FootstepsProto$LocalityOrBuilder {
        /* synthetic */ C7306a(C7304a aVar) {
            this();
        }

        public C6950b0 getCentroid() {
            return ((C7305b) this.instance).getCentroid();
        }

        public String getCountryIsoCode() {
            return ((C7305b) this.instance).getCountryIsoCode();
        }

        public ByteString getCountryIsoCodeBytes() {
            return ((C7305b) this.instance).getCountryIsoCodeBytes();
        }

        public Timestamp getLastVisit() {
            return ((C7305b) this.instance).getLastVisit();
        }

        public String getLocalityId() {
            return ((C7305b) this.instance).getLocalityId();
        }

        public ByteString getLocalityIdBytes() {
            return ((C7305b) this.instance).getLocalityIdBytes();
        }

        public String getLocalityName() {
            return ((C7305b) this.instance).getLocalityName();
        }

        public ByteString getLocalityNameBytes() {
            return ((C7305b) this.instance).getLocalityNameBytes();
        }

        public String getParentCountryIsoCode() {
            return ((C7305b) this.instance).getParentCountryIsoCode();
        }

        public ByteString getParentCountryIsoCodeBytes() {
            return ((C7305b) this.instance).getParentCountryIsoCodeBytes();
        }

        public C7917e getType() {
            return ((C7305b) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7305b) this.instance).getTypeValue();
        }

        public Duration getVisitTotalDuration() {
            return ((C7305b) this.instance).getVisitTotalDuration();
        }

        public int getVisiteCount() {
            return ((C7305b) this.instance).getVisiteCount();
        }

        public boolean hasCentroid() {
            return ((C7305b) this.instance).hasCentroid();
        }

        public boolean hasLastVisit() {
            return ((C7305b) this.instance).hasLastVisit();
        }

        public boolean hasVisitTotalDuration() {
            return ((C7305b) this.instance).hasVisitTotalDuration();
        }

        private C7306a() {
            super(C7305b.f18132n);
        }
    }

    static {
        f18132n.makeImmutable();
    }

    private C7305b() {
        String str = "";
        this.f18134e = str;
        this.f18135f = str;
        this.f18141l = str;
        this.f18142m = str;
    }

    public static Parser<C7305b> parser() {
        return f18132n.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7304a.f18131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7305b();
            case 2:
                return f18132n;
            case 3:
                return null;
            case 4:
                return new C7306a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7305b bVar = (C7305b) obj2;
                this.f18134e = visitor.visitString(!this.f18134e.isEmpty(), this.f18134e, !bVar.f18134e.isEmpty(), bVar.f18134e);
                this.f18135f = visitor.visitString(!this.f18135f.isEmpty(), this.f18135f, !bVar.f18135f.isEmpty(), bVar.f18135f);
                this.f18136g = (Timestamp) visitor.visitMessage(this.f18136g, bVar.f18136g);
                this.f18137h = visitor.visitInt(this.f18137h != 0, this.f18137h, bVar.f18137h != 0, bVar.f18137h);
                this.f18138i = (Duration) visitor.visitMessage(this.f18138i, bVar.f18138i);
                boolean z2 = this.f18139j != 0;
                int i = this.f18139j;
                if (bVar.f18139j != 0) {
                    z = true;
                }
                this.f18139j = visitor.visitInt(z2, i, z, bVar.f18139j);
                this.f18140k = (C6950b0) visitor.visitMessage(this.f18140k, bVar.f18140k);
                this.f18141l = visitor.visitString(!this.f18141l.isEmpty(), this.f18141l, !bVar.f18141l.isEmpty(), bVar.f18141l);
                this.f18142m = visitor.visitString(!this.f18142m.isEmpty(), this.f18142m, !bVar.f18142m.isEmpty(), bVar.f18142m);
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
                                this.f18134e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18135f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                Builder builder = this.f18136g != null ? (Timestamp.Builder) this.f18136g.toBuilder() : null;
                                this.f18136g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18136g);
                                    this.f18136g = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 32) {
                                this.f18137h = codedInputStream.readInt32();
                            } else if (readTag == 40) {
                                this.f18139j = codedInputStream.readEnum();
                            } else if (readTag == 50) {
                                Builder builder2 = this.f18140k != null ? (C6951a) this.f18140k.toBuilder() : null;
                                this.f18140k = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18140k);
                                    this.f18140k = (C6950b0) builder2.buildPartial();
                                }
                            } else if (readTag == 58) {
                                this.f18141l = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 66) {
                                this.f18142m = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 74) {
                                Builder builder3 = this.f18138i != null ? (Duration.Builder) this.f18138i.toBuilder() : null;
                                this.f18138i = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f18138i);
                                    this.f18138i = (Duration) builder3.buildPartial();
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
                if (f18133o == null) {
                    synchronized (C7305b.class) {
                        if (f18133o == null) {
                            f18133o = new DefaultInstanceBasedParser(f18132n);
                        }
                    }
                }
                return f18133o;
            default:
                throw new UnsupportedOperationException();
        }
        return f18132n;
    }

    public C6950b0 getCentroid() {
        C6950b0 b0Var = this.f18140k;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public String getCountryIsoCode() {
        return this.f18141l;
    }

    public ByteString getCountryIsoCodeBytes() {
        return ByteString.copyFromUtf8(this.f18141l);
    }

    public Timestamp getLastVisit() {
        Timestamp timestamp = this.f18136g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getLocalityId() {
        return this.f18134e;
    }

    public ByteString getLocalityIdBytes() {
        return ByteString.copyFromUtf8(this.f18134e);
    }

    public String getLocalityName() {
        return this.f18135f;
    }

    public ByteString getLocalityNameBytes() {
        return ByteString.copyFromUtf8(this.f18135f);
    }

    public String getParentCountryIsoCode() {
        return this.f18142m;
    }

    public ByteString getParentCountryIsoCodeBytes() {
        return ByteString.copyFromUtf8(this.f18142m);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18134e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getLocalityId());
        }
        if (!this.f18135f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getLocalityName());
        }
        if (this.f18136g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getLastVisit());
        }
        int i3 = this.f18137h;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i3);
        }
        if (this.f18139j != C7917e.UNUSED.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(5, this.f18139j);
        }
        if (this.f18140k != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getCentroid());
        }
        if (!this.f18141l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(7, getCountryIsoCode());
        }
        if (!this.f18142m.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(8, getParentCountryIsoCode());
        }
        if (this.f18138i != null) {
            i2 += CodedOutputStream.computeMessageSize(9, getVisitTotalDuration());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7917e getType() {
        C7917e a = C7917e.m18960a(this.f18139j);
        return a == null ? C7917e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18139j;
    }

    public Duration getVisitTotalDuration() {
        Duration duration = this.f18138i;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public int getVisiteCount() {
        return this.f18137h;
    }

    public boolean hasCentroid() {
        return this.f18140k != null;
    }

    public boolean hasLastVisit() {
        return this.f18136g != null;
    }

    public boolean hasVisitTotalDuration() {
        return this.f18138i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18134e.isEmpty()) {
            codedOutputStream.writeString(1, getLocalityId());
        }
        if (!this.f18135f.isEmpty()) {
            codedOutputStream.writeString(2, getLocalityName());
        }
        if (this.f18136g != null) {
            codedOutputStream.writeMessage(3, getLastVisit());
        }
        int i = this.f18137h;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
        if (this.f18139j != C7917e.UNUSED.getNumber()) {
            codedOutputStream.writeEnum(5, this.f18139j);
        }
        if (this.f18140k != null) {
            codedOutputStream.writeMessage(6, getCentroid());
        }
        if (!this.f18141l.isEmpty()) {
            codedOutputStream.writeString(7, getCountryIsoCode());
        }
        if (!this.f18142m.isEmpty()) {
            codedOutputStream.writeString(8, getParentCountryIsoCode());
        }
        if (this.f18138i != null) {
            codedOutputStream.writeMessage(9, getVisitTotalDuration());
        }
    }
}
