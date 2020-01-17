package p213co.znly.models;

import java.io.IOException;
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

/* renamed from: co.znly.models.b1 */
public final class C6952b1 extends GeneratedMessageLite<C6952b1, C6953a> implements PhoneNumberProto$PhoneNumberProbationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C6952b1 f17127k = new C6952b1();

    /* renamed from: l */
    private static volatile Parser<C6952b1> f17128l;

    /* renamed from: e */
    private int f17129e;

    /* renamed from: f */
    private String f17130f;

    /* renamed from: g */
    private Timestamp f17131g;

    /* renamed from: h */
    private int f17132h;

    /* renamed from: i */
    private String f17133i;

    /* renamed from: j */
    private Timestamp f17134j;

    /* renamed from: co.znly.models.b1$a */
    public static final class C6953a extends Builder<C6952b1, C6953a> implements PhoneNumberProto$PhoneNumberProbationOrBuilder {
        /* synthetic */ C6953a(C6945a1 a1Var) {
            this();
        }

        public String getHashedPhoneNumber() {
            return ((C6952b1) this.instance).getHashedPhoneNumber();
        }

        public ByteString getHashedPhoneNumberBytes() {
            return ((C6952b1) this.instance).getHashedPhoneNumberBytes();
        }

        public C6954b getReason() {
            return ((C6952b1) this.instance).getReason();
        }

        public String getReasonText() {
            return ((C6952b1) this.instance).getReasonText();
        }

        public ByteString getReasonTextBytes() {
            return ((C6952b1) this.instance).getReasonTextBytes();
        }

        public int getReasonValue() {
            return ((C6952b1) this.instance).getReasonValue();
        }

        public C6956c getType() {
            return ((C6952b1) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C6952b1) this.instance).getTypeValue();
        }

        public Timestamp getUntil() {
            return ((C6952b1) this.instance).getUntil();
        }

        public Timestamp getUpdatedAt() {
            return ((C6952b1) this.instance).getUpdatedAt();
        }

        public boolean hasUntil() {
            return ((C6952b1) this.instance).hasUntil();
        }

        public boolean hasUpdatedAt() {
            return ((C6952b1) this.instance).hasUpdatedAt();
        }

        private C6953a() {
            super(C6952b1.f17127k);
        }
    }

    /* renamed from: co.znly.models.b1$b */
    public enum C6954b implements EnumLite {
        REASON_UNKNOWN(0),
        REASON_OTHER(1),
        REASON_DELETE_RATE_LIMIT(2),
        REASON_AGE_GATING(3),
        REASON_TOO_MANY_BLOCKED(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17142e;

        /* renamed from: co.znly.models.b1$b$a */
        class C6955a implements EnumLiteMap<C6954b> {
            C6955a() {
            }

            public C6954b findValueByNumber(int i) {
                return C6954b.m17698a(i);
            }
        }

        static {
            new C6955a();
        }

        private C6954b(int i) {
            this.f17142e = i;
        }

        /* renamed from: a */
        public static C6954b m17698a(int i) {
            if (i == 0) {
                return REASON_UNKNOWN;
            }
            if (i == 1) {
                return REASON_OTHER;
            }
            if (i == 2) {
                return REASON_DELETE_RATE_LIMIT;
            }
            if (i == 3) {
                return REASON_AGE_GATING;
            }
            if (i != 4) {
                return null;
            }
            return REASON_TOO_MANY_BLOCKED;
        }

        public final int getNumber() {
            return this.f17142e;
        }
    }

    /* renamed from: co.znly.models.b1$c */
    public enum C6956c implements EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_BAN(1),
        TYPE_DEACTIVATION(2),
        TYPE_UNDER_REVIEW(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17149e;

        /* renamed from: co.znly.models.b1$c$a */
        class C6957a implements EnumLiteMap<C6956c> {
            C6957a() {
            }

            public C6956c findValueByNumber(int i) {
                return C6956c.m17699a(i);
            }
        }

        static {
            new C6957a();
        }

        private C6956c(int i) {
            this.f17149e = i;
        }

        /* renamed from: a */
        public static C6956c m17699a(int i) {
            if (i == 0) {
                return TYPE_UNKNOWN;
            }
            if (i == 1) {
                return TYPE_BAN;
            }
            if (i == 2) {
                return TYPE_DEACTIVATION;
            }
            if (i != 3) {
                return null;
            }
            return TYPE_UNDER_REVIEW;
        }

        public final int getNumber() {
            return this.f17149e;
        }
    }

    static {
        f17127k.makeImmutable();
    }

    private C6952b1() {
        String str = "";
        this.f17130f = str;
        this.f17133i = str;
    }

    public static C6952b1 getDefaultInstance() {
        return f17127k;
    }

    public static Parser<C6952b1> parser() {
        return f17127k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6945a1.f17112a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6952b1();
            case 2:
                return f17127k;
            case 3:
                return null;
            case 4:
                return new C6953a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6952b1 b1Var = (C6952b1) obj2;
                this.f17129e = visitor.visitInt(this.f17129e != 0, this.f17129e, b1Var.f17129e != 0, b1Var.f17129e);
                this.f17130f = visitor.visitString(!this.f17130f.isEmpty(), this.f17130f, !b1Var.f17130f.isEmpty(), b1Var.f17130f);
                this.f17131g = (Timestamp) visitor.visitMessage(this.f17131g, b1Var.f17131g);
                boolean z2 = this.f17132h != 0;
                int i = this.f17132h;
                if (b1Var.f17132h != 0) {
                    z = true;
                }
                this.f17132h = visitor.visitInt(z2, i, z, b1Var.f17132h);
                this.f17133i = visitor.visitString(!this.f17133i.isEmpty(), this.f17133i, !b1Var.f17133i.isEmpty(), b1Var.f17133i);
                this.f17134j = (Timestamp) visitor.visitMessage(this.f17134j, b1Var.f17134j);
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
                                this.f17129e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f17130f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                Builder builder = this.f17131g != null ? (Timestamp.Builder) this.f17131g.toBuilder() : null;
                                this.f17131g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17131g);
                                    this.f17131g = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 32) {
                                this.f17132h = codedInputStream.readEnum();
                            } else if (readTag == 42) {
                                this.f17133i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                Builder builder2 = this.f17134j != null ? (Timestamp.Builder) this.f17134j.toBuilder() : null;
                                this.f17134j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17134j);
                                    this.f17134j = (Timestamp) builder2.buildPartial();
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
                if (f17128l == null) {
                    synchronized (C6952b1.class) {
                        if (f17128l == null) {
                            f17128l = new DefaultInstanceBasedParser(f17127k);
                        }
                    }
                }
                return f17128l;
            default:
                throw new UnsupportedOperationException();
        }
        return f17127k;
    }

    public String getHashedPhoneNumber() {
        return this.f17133i;
    }

    public ByteString getHashedPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f17133i);
    }

    public C6954b getReason() {
        C6954b a = C6954b.m17698a(this.f17129e);
        return a == null ? C6954b.UNRECOGNIZED : a;
    }

    public String getReasonText() {
        return this.f17130f;
    }

    public ByteString getReasonTextBytes() {
        return ByteString.copyFromUtf8(this.f17130f);
    }

    public int getReasonValue() {
        return this.f17129e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17129e != C6954b.REASON_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17129e);
        }
        if (!this.f17130f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getReasonText());
        }
        if (this.f17131g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getUntil());
        }
        if (this.f17132h != C6956c.TYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(4, this.f17132h);
        }
        if (!this.f17133i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getHashedPhoneNumber());
        }
        if (this.f17134j != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getUpdatedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6956c getType() {
        C6956c a = C6956c.m17699a(this.f17132h);
        return a == null ? C6956c.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f17132h;
    }

    public Timestamp getUntil() {
        Timestamp timestamp = this.f17131g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.f17134j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasUntil() {
        return this.f17131g != null;
    }

    public boolean hasUpdatedAt() {
        return this.f17134j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17129e != C6954b.REASON_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f17129e);
        }
        if (!this.f17130f.isEmpty()) {
            codedOutputStream.writeString(2, getReasonText());
        }
        if (this.f17131g != null) {
            codedOutputStream.writeMessage(3, getUntil());
        }
        if (this.f17132h != C6956c.TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(4, this.f17132h);
        }
        if (!this.f17133i.isEmpty()) {
            codedOutputStream.writeString(5, getHashedPhoneNumber());
        }
        if (this.f17134j != null) {
            codedOutputStream.writeMessage(6, getUpdatedAt());
        }
    }
}
