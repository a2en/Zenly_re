package p213co.znly.models;

import java.io.IOException;
import java.io.InputStream;
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
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.n2 */
public final class C7402n2 extends GeneratedMessageLite<C7402n2, C7403a> implements SessionProto$SessionOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C7402n2 f18466r = new C7402n2();

    /* renamed from: s */
    private static volatile Parser<C7402n2> f18467s;

    /* renamed from: e */
    private Timestamp f18468e;

    /* renamed from: f */
    private Timestamp f18469f;

    /* renamed from: g */
    private Timestamp f18470g;

    /* renamed from: h */
    private String f18471h;

    /* renamed from: i */
    private String f18472i;

    /* renamed from: j */
    private String f18473j;

    /* renamed from: k */
    private String f18474k;

    /* renamed from: l */
    private String f18475l;

    /* renamed from: m */
    private String f18476m;

    /* renamed from: n */
    private int f18477n;

    /* renamed from: o */
    private int f18478o;

    /* renamed from: p */
    private boolean f18479p;

    /* renamed from: q */
    private boolean f18480q;

    /* renamed from: co.znly.models.n2$a */
    public static final class C7403a extends Builder<C7402n2, C7403a> implements SessionProto$SessionOrBuilder {
        /* synthetic */ C7403a(C7393m2 m2Var) {
            this();
        }

        public String getAuthUuid() {
            return ((C7402n2) this.instance).getAuthUuid();
        }

        public ByteString getAuthUuidBytes() {
            return ((C7402n2) this.instance).getAuthUuidBytes();
        }

        public Timestamp getClosedAt() {
            return ((C7402n2) this.instance).getClosedAt();
        }

        public Timestamp getCreatedAt() {
            return ((C7402n2) this.instance).getCreatedAt();
        }

        public String getDeviceType() {
            return ((C7402n2) this.instance).getDeviceType();
        }

        public ByteString getDeviceTypeBytes() {
            return ((C7402n2) this.instance).getDeviceTypeBytes();
        }

        public String getDeviceUuid() {
            return ((C7402n2) this.instance).getDeviceUuid();
        }

        public ByteString getDeviceUuidBytes() {
            return ((C7402n2) this.instance).getDeviceUuidBytes();
        }

        public boolean getIsNewDevice() {
            return ((C7402n2) this.instance).getIsNewDevice();
        }

        public boolean getIsNewUser() {
            return ((C7402n2) this.instance).getIsNewUser();
        }

        public String getPhoneNumber() {
            return ((C7402n2) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((C7402n2) this.instance).getPhoneNumberBytes();
        }

        public C7404b getStatus() {
            return ((C7402n2) this.instance).getStatus();
        }

        @Deprecated
        public C7406c getStatusBeforeScyllaMigration() {
            return ((C7402n2) this.instance).getStatusBeforeScyllaMigration();
        }

        @Deprecated
        public int getStatusBeforeScyllaMigrationValue() {
            return ((C7402n2) this.instance).getStatusBeforeScyllaMigrationValue();
        }

        public int getStatusValue() {
            return ((C7402n2) this.instance).getStatusValue();
        }

        public String getUserUuid() {
            return ((C7402n2) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7402n2) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((C7402n2) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7402n2) this.instance).getUuidBytes();
        }

        public Timestamp getVerifiedAt() {
            return ((C7402n2) this.instance).getVerifiedAt();
        }

        public boolean hasClosedAt() {
            return ((C7402n2) this.instance).hasClosedAt();
        }

        public boolean hasCreatedAt() {
            return ((C7402n2) this.instance).hasCreatedAt();
        }

        public boolean hasVerifiedAt() {
            return ((C7402n2) this.instance).hasVerifiedAt();
        }

        private C7403a() {
            super(C7402n2.f18466r);
        }
    }

    /* renamed from: co.znly.models.n2$b */
    public enum C7404b implements EnumLite {
        STATUS_UNKNOWN(0),
        STATUS_CLOSED(1),
        STATUS_AUTHENTICATING(2),
        STATUS_EXPIRED(3),
        STATUS_AUTHENTICATING_OR_EXPIRED(4),
        STATUS_BACK_OFFICE(5),
        STATUS_VALID(255),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18490e;

        /* renamed from: co.znly.models.n2$b$a */
        class C7405a implements EnumLiteMap<C7404b> {
            C7405a() {
            }

            public C7404b findValueByNumber(int i) {
                return C7404b.m18079a(i);
            }
        }

        static {
            new C7405a();
        }

        private C7404b(int i) {
            this.f18490e = i;
        }

        /* renamed from: a */
        public static C7404b m18079a(int i) {
            if (i == 0) {
                return STATUS_UNKNOWN;
            }
            if (i == 1) {
                return STATUS_CLOSED;
            }
            if (i == 2) {
                return STATUS_AUTHENTICATING;
            }
            if (i == 3) {
                return STATUS_EXPIRED;
            }
            if (i == 4) {
                return STATUS_AUTHENTICATING_OR_EXPIRED;
            }
            if (i == 5) {
                return STATUS_BACK_OFFICE;
            }
            if (i != 255) {
                return null;
            }
            return STATUS_VALID;
        }

        public final int getNumber() {
            return this.f18490e;
        }
    }

    /* renamed from: co.znly.models.n2$c */
    public enum C7406c implements EnumLite {
        STATUS_BEFORE_SCYLLA_MIGRATION_VALID(0),
        STATUS_BEFORE_SCYLLA_MIGRATION_CLOSED(1),
        STATUS_BEFORE_SCYLLA_MIGRATION_AUTHENTICATING(2),
        STATUS_BEFORE_SCYLLA_MIGRATION_EXPIRED(3),
        STATUS_BEFORE_SCYLLA_MIGRATION_AUTHENTICATING_OR_EXPIRED(4),
        STATUS_BEFORE_SCYLLA_MIGRATION_BACK_OFFICE(5),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18499e;

        /* renamed from: co.znly.models.n2$c$a */
        class C7407a implements EnumLiteMap<C7406c> {
            C7407a() {
            }

            public C7406c findValueByNumber(int i) {
                return C7406c.m18080a(i);
            }
        }

        static {
            new C7407a();
        }

        private C7406c(int i) {
            this.f18499e = i;
        }

        /* renamed from: a */
        public static C7406c m18080a(int i) {
            if (i == 0) {
                return STATUS_BEFORE_SCYLLA_MIGRATION_VALID;
            }
            if (i == 1) {
                return STATUS_BEFORE_SCYLLA_MIGRATION_CLOSED;
            }
            if (i == 2) {
                return STATUS_BEFORE_SCYLLA_MIGRATION_AUTHENTICATING;
            }
            if (i == 3) {
                return STATUS_BEFORE_SCYLLA_MIGRATION_EXPIRED;
            }
            if (i == 4) {
                return STATUS_BEFORE_SCYLLA_MIGRATION_AUTHENTICATING_OR_EXPIRED;
            }
            if (i != 5) {
                return null;
            }
            return STATUS_BEFORE_SCYLLA_MIGRATION_BACK_OFFICE;
        }

        public final int getNumber() {
            return this.f18499e;
        }
    }

    static {
        f18466r.makeImmutable();
    }

    private C7402n2() {
        String str = "";
        this.f18471h = str;
        this.f18472i = str;
        this.f18473j = str;
        this.f18474k = str;
        this.f18475l = str;
        this.f18476m = str;
    }

    public static C7402n2 getDefaultInstance() {
        return f18466r;
    }

    public static C7403a newBuilder() {
        return (C7403a) f18466r.toBuilder();
    }

    public static C7402n2 parseFrom(InputStream inputStream) throws IOException {
        return (C7402n2) GeneratedMessageLite.parseFrom(f18466r, inputStream);
    }

    public static Parser<C7402n2> parser() {
        return f18466r.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7393m2.f18440a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7402n2();
            case 2:
                return f18466r;
            case 3:
                return null;
            case 4:
                return new C7403a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7402n2 n2Var = (C7402n2) obj2;
                this.f18468e = (Timestamp) visitor.visitMessage(this.f18468e, n2Var.f18468e);
                this.f18469f = (Timestamp) visitor.visitMessage(this.f18469f, n2Var.f18469f);
                this.f18470g = (Timestamp) visitor.visitMessage(this.f18470g, n2Var.f18470g);
                this.f18471h = visitor.visitString(!this.f18471h.isEmpty(), this.f18471h, !n2Var.f18471h.isEmpty(), n2Var.f18471h);
                this.f18472i = visitor.visitString(!this.f18472i.isEmpty(), this.f18472i, !n2Var.f18472i.isEmpty(), n2Var.f18472i);
                this.f18473j = visitor.visitString(!this.f18473j.isEmpty(), this.f18473j, !n2Var.f18473j.isEmpty(), n2Var.f18473j);
                this.f18474k = visitor.visitString(!this.f18474k.isEmpty(), this.f18474k, !n2Var.f18474k.isEmpty(), n2Var.f18474k);
                this.f18475l = visitor.visitString(!this.f18475l.isEmpty(), this.f18475l, !n2Var.f18475l.isEmpty(), n2Var.f18475l);
                this.f18476m = visitor.visitString(!this.f18476m.isEmpty(), this.f18476m, !n2Var.f18476m.isEmpty(), n2Var.f18476m);
                this.f18477n = visitor.visitInt(this.f18477n != 0, this.f18477n, n2Var.f18477n != 0, n2Var.f18477n);
                boolean z2 = this.f18478o != 0;
                int i = this.f18478o;
                if (n2Var.f18478o != 0) {
                    z = true;
                }
                this.f18478o = visitor.visitInt(z2, i, z, n2Var.f18478o);
                boolean z3 = this.f18479p;
                boolean z4 = n2Var.f18479p;
                this.f18479p = visitor.visitBoolean(z3, z3, z4, z4);
                boolean z5 = this.f18480q;
                boolean z6 = n2Var.f18480q;
                this.f18480q = visitor.visitBoolean(z5, z5, z6, z6);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
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
                                this.f18471h = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f18468e != null ? (Timestamp.Builder) this.f18468e.toBuilder() : null;
                                this.f18468e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f18468e);
                                    this.f18468e = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f18472i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f18473j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.f18474k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 48:
                                this.f18479p = codedInputStream.readBool();
                                break;
                            case 56:
                                this.f18480q = codedInputStream.readBool();
                                break;
                            case 66:
                                Builder builder2 = this.f18470g != null ? (Timestamp.Builder) this.f18470g.toBuilder() : null;
                                this.f18470g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f18470g);
                                    this.f18470g = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 80:
                                this.f18477n = codedInputStream.readEnum();
                                break;
                            case 98:
                                this.f18475l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 106:
                                Builder builder3 = this.f18469f != null ? (Timestamp.Builder) this.f18469f.toBuilder() : null;
                                this.f18469f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f18469f);
                                    this.f18469f = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 114:
                                this.f18476m = codedInputStream.readStringRequireUtf8();
                                break;
                            case 120:
                                this.f18478o = codedInputStream.readEnum();
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
                if (f18467s == null) {
                    synchronized (C7402n2.class) {
                        if (f18467s == null) {
                            f18467s = new DefaultInstanceBasedParser(f18466r);
                        }
                    }
                }
                return f18467s;
            default:
                throw new UnsupportedOperationException();
        }
        return f18466r;
    }

    public String getAuthUuid() {
        return this.f18475l;
    }

    public ByteString getAuthUuidBytes() {
        return ByteString.copyFromUtf8(this.f18475l);
    }

    public Timestamp getClosedAt() {
        Timestamp timestamp = this.f18470g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f18468e;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getDeviceType() {
        return this.f18476m;
    }

    public ByteString getDeviceTypeBytes() {
        return ByteString.copyFromUtf8(this.f18476m);
    }

    public String getDeviceUuid() {
        return this.f18473j;
    }

    public ByteString getDeviceUuidBytes() {
        return ByteString.copyFromUtf8(this.f18473j);
    }

    public boolean getIsNewDevice() {
        return this.f18480q;
    }

    public boolean getIsNewUser() {
        return this.f18479p;
    }

    public String getPhoneNumber() {
        return this.f18474k;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f18474k);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18471h.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        if (this.f18468e != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f18472i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getUserUuid());
        }
        if (!this.f18473j.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getDeviceUuid());
        }
        if (!this.f18474k.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getPhoneNumber());
        }
        boolean z = this.f18479p;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(6, z);
        }
        boolean z2 = this.f18480q;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(7, z2);
        }
        if (this.f18470g != null) {
            i2 += CodedOutputStream.computeMessageSize(8, getClosedAt());
        }
        if (this.f18477n != C7406c.STATUS_BEFORE_SCYLLA_MIGRATION_VALID.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(10, this.f18477n);
        }
        if (!this.f18475l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(12, getAuthUuid());
        }
        if (this.f18469f != null) {
            i2 += CodedOutputStream.computeMessageSize(13, getVerifiedAt());
        }
        if (!this.f18476m.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(14, getDeviceType());
        }
        if (this.f18478o != C7404b.STATUS_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(15, this.f18478o);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7404b getStatus() {
        C7404b a = C7404b.m18079a(this.f18478o);
        return a == null ? C7404b.UNRECOGNIZED : a;
    }

    @Deprecated
    public C7406c getStatusBeforeScyllaMigration() {
        C7406c a = C7406c.m18080a(this.f18477n);
        return a == null ? C7406c.UNRECOGNIZED : a;
    }

    @Deprecated
    public int getStatusBeforeScyllaMigrationValue() {
        return this.f18477n;
    }

    public int getStatusValue() {
        return this.f18478o;
    }

    public String getUserUuid() {
        return this.f18472i;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18472i);
    }

    public String getUuid() {
        return this.f18471h;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f18471h);
    }

    public Timestamp getVerifiedAt() {
        Timestamp timestamp = this.f18469f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasClosedAt() {
        return this.f18470g != null;
    }

    public boolean hasCreatedAt() {
        return this.f18468e != null;
    }

    public boolean hasVerifiedAt() {
        return this.f18469f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18471h.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f18468e != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f18472i.isEmpty()) {
            codedOutputStream.writeString(3, getUserUuid());
        }
        if (!this.f18473j.isEmpty()) {
            codedOutputStream.writeString(4, getDeviceUuid());
        }
        if (!this.f18474k.isEmpty()) {
            codedOutputStream.writeString(5, getPhoneNumber());
        }
        boolean z = this.f18479p;
        if (z) {
            codedOutputStream.writeBool(6, z);
        }
        boolean z2 = this.f18480q;
        if (z2) {
            codedOutputStream.writeBool(7, z2);
        }
        if (this.f18470g != null) {
            codedOutputStream.writeMessage(8, getClosedAt());
        }
        if (this.f18477n != C7406c.STATUS_BEFORE_SCYLLA_MIGRATION_VALID.getNumber()) {
            codedOutputStream.writeEnum(10, this.f18477n);
        }
        if (!this.f18475l.isEmpty()) {
            codedOutputStream.writeString(12, getAuthUuid());
        }
        if (this.f18469f != null) {
            codedOutputStream.writeMessage(13, getVerifiedAt());
        }
        if (!this.f18476m.isEmpty()) {
            codedOutputStream.writeString(14, getDeviceType());
        }
        if (this.f18478o != C7404b.STATUS_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(15, this.f18478o);
        }
    }
}
