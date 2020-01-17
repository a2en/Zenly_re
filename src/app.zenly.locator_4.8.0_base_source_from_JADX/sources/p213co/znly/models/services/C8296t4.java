package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7471t;
import p213co.znly.models.C7471t.C7472a;

/* renamed from: co.znly.models.services.t4 */
public final class C8296t4 extends GeneratedMessageLite<C8296t4, C8297a> implements ZenlyProto$SessionVerifyRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C8296t4 f20966n = new C8296t4();

    /* renamed from: o */
    private static volatile Parser<C8296t4> f20967o;

    /* renamed from: e */
    private String f20968e;

    /* renamed from: f */
    private String f20969f;

    /* renamed from: g */
    private String f20970g;

    /* renamed from: h */
    private String f20971h;

    /* renamed from: i */
    private String f20972i;

    /* renamed from: j */
    private C7471t f20973j;

    /* renamed from: k */
    private Timestamp f20974k;

    /* renamed from: l */
    private boolean f20975l;

    /* renamed from: m */
    private boolean f20976m;

    /* renamed from: co.znly.models.services.t4$a */
    public static final class C8297a extends Builder<C8296t4, C8297a> implements ZenlyProto$SessionVerifyRequestOrBuilder {
        /* synthetic */ C8297a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8297a mo22258a(String str) {
            copyOnWrite();
            ((C8296t4) this.instance).m19366a(str);
            return this;
        }

        /* renamed from: b */
        public C8297a mo22260b(String str) {
            copyOnWrite();
            ((C8296t4) this.instance).m19369b(str);
            return this;
        }

        /* renamed from: c */
        public C8297a mo22261c(String str) {
            copyOnWrite();
            ((C8296t4) this.instance).m19371c(str);
            return this;
        }

        /* renamed from: d */
        public C8297a mo22262d(String str) {
            copyOnWrite();
            ((C8296t4) this.instance).m19373d(str);
            return this;
        }

        public Timestamp getBirthdate() {
            return ((C8296t4) this.instance).getBirthdate();
        }

        public String getCode() {
            return ((C8296t4) this.instance).getCode();
        }

        public ByteString getCodeBytes() {
            return ((C8296t4) this.instance).getCodeBytes();
        }

        public C7471t getDevice() {
            return ((C8296t4) this.instance).getDevice();
        }

        public String getDeviceOsUuid() {
            return ((C8296t4) this.instance).getDeviceOsUuid();
        }

        public ByteString getDeviceOsUuidBytes() {
            return ((C8296t4) this.instance).getDeviceOsUuidBytes();
        }

        public boolean getDomainErrorInResponse() {
            return ((C8296t4) this.instance).getDomainErrorInResponse();
        }

        public boolean getErrorIfSuspended() {
            return ((C8296t4) this.instance).getErrorIfSuspended();
        }

        public String getPhoneNumber() {
            return ((C8296t4) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((C8296t4) this.instance).getPhoneNumberBytes();
        }

        public String getSessionUuid() {
            return ((C8296t4) this.instance).getSessionUuid();
        }

        public ByteString getSessionUuidBytes() {
            return ((C8296t4) this.instance).getSessionUuidBytes();
        }

        public String getUserName() {
            return ((C8296t4) this.instance).getUserName();
        }

        public ByteString getUserNameBytes() {
            return ((C8296t4) this.instance).getUserNameBytes();
        }

        public boolean hasBirthdate() {
            return ((C8296t4) this.instance).hasBirthdate();
        }

        public boolean hasDevice() {
            return ((C8296t4) this.instance).hasDevice();
        }

        private C8297a() {
            super(C8296t4.f20966n);
        }

        /* renamed from: a */
        public C8297a mo22257a(Timestamp timestamp) {
            copyOnWrite();
            ((C8296t4) this.instance).m19362a(timestamp);
            return this;
        }

        /* renamed from: a */
        public C8297a mo22259a(boolean z) {
            copyOnWrite();
            ((C8296t4) this.instance).m19367a(z);
            return this;
        }
    }

    static {
        f20966n.makeImmutable();
    }

    private C8296t4() {
        String str = "";
        this.f20968e = str;
        this.f20969f = str;
        this.f20970g = str;
        this.f20971h = str;
        this.f20972i = str;
    }

    public static C8297a newBuilder() {
        return (C8297a) f20966n.toBuilder();
    }

    public static C8296t4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C8296t4) GeneratedMessageLite.parseFrom(f20966n, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8296t4();
            case 2:
                return f20966n;
            case 3:
                return null;
            case 4:
                return new C8297a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8296t4 t4Var = (C8296t4) obj2;
                this.f20968e = visitor.visitString(!this.f20968e.isEmpty(), this.f20968e, !t4Var.f20968e.isEmpty(), t4Var.f20968e);
                this.f20969f = visitor.visitString(!this.f20969f.isEmpty(), this.f20969f, !t4Var.f20969f.isEmpty(), t4Var.f20969f);
                this.f20970g = visitor.visitString(!this.f20970g.isEmpty(), this.f20970g, !t4Var.f20970g.isEmpty(), t4Var.f20970g);
                this.f20971h = visitor.visitString(!this.f20971h.isEmpty(), this.f20971h, !t4Var.f20971h.isEmpty(), t4Var.f20971h);
                this.f20972i = visitor.visitString(!this.f20972i.isEmpty(), this.f20972i, true ^ t4Var.f20972i.isEmpty(), t4Var.f20972i);
                this.f20973j = (C7471t) visitor.visitMessage(this.f20973j, t4Var.f20973j);
                this.f20974k = (Timestamp) visitor.visitMessage(this.f20974k, t4Var.f20974k);
                boolean z = this.f20975l;
                boolean z2 = t4Var.f20975l;
                this.f20975l = visitor.visitBoolean(z, z, z2, z2);
                boolean z3 = this.f20976m;
                boolean z4 = t4Var.f20976m;
                this.f20976m = visitor.visitBoolean(z3, z3, z4, z4);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20968e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20969f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20970g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f20971h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f20972i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                Builder builder = this.f20973j != null ? (C7472a) this.f20973j.toBuilder() : null;
                                this.f20973j = (C7471t) codedInputStream.readMessage(C7471t.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20973j);
                                    this.f20973j = (C7471t) builder.buildPartial();
                                }
                            } else if (readTag == 58) {
                                Builder builder2 = this.f20974k != null ? (Timestamp.Builder) this.f20974k.toBuilder() : null;
                                this.f20974k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20974k);
                                    this.f20974k = (Timestamp) builder2.buildPartial();
                                }
                            } else if (readTag == 64) {
                                this.f20975l = codedInputStream.readBool();
                            } else if (readTag == 72) {
                                this.f20976m = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z5 = true;
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
                if (f20967o == null) {
                    synchronized (C8296t4.class) {
                        if (f20967o == null) {
                            f20967o = new DefaultInstanceBasedParser(f20966n);
                        }
                    }
                }
                return f20967o;
            default:
                throw new UnsupportedOperationException();
        }
        return f20966n;
    }

    public Timestamp getBirthdate() {
        Timestamp timestamp = this.f20974k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getCode() {
        return this.f20972i;
    }

    public ByteString getCodeBytes() {
        return ByteString.copyFromUtf8(this.f20972i);
    }

    public C7471t getDevice() {
        C7471t tVar = this.f20973j;
        return tVar == null ? C7471t.getDefaultInstance() : tVar;
    }

    public String getDeviceOsUuid() {
        return this.f20971h;
    }

    public ByteString getDeviceOsUuidBytes() {
        return ByteString.copyFromUtf8(this.f20971h);
    }

    public boolean getDomainErrorInResponse() {
        return this.f20976m;
    }

    public boolean getErrorIfSuspended() {
        return this.f20975l;
    }

    public String getPhoneNumber() {
        return this.f20969f;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f20969f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20968e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getSessionUuid());
        }
        if (!this.f20969f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getPhoneNumber());
        }
        if (!this.f20970g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getUserName());
        }
        if (!this.f20971h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getDeviceOsUuid());
        }
        if (!this.f20972i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getCode());
        }
        if (this.f20973j != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getDevice());
        }
        if (this.f20974k != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getBirthdate());
        }
        boolean z = this.f20975l;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(8, z);
        }
        boolean z2 = this.f20976m;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(9, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getSessionUuid() {
        return this.f20968e;
    }

    public ByteString getSessionUuidBytes() {
        return ByteString.copyFromUtf8(this.f20968e);
    }

    public String getUserName() {
        return this.f20970g;
    }

    public ByteString getUserNameBytes() {
        return ByteString.copyFromUtf8(this.f20970g);
    }

    public boolean hasBirthdate() {
        return this.f20974k != null;
    }

    public boolean hasDevice() {
        return this.f20973j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20968e.isEmpty()) {
            codedOutputStream.writeString(1, getSessionUuid());
        }
        if (!this.f20969f.isEmpty()) {
            codedOutputStream.writeString(2, getPhoneNumber());
        }
        if (!this.f20970g.isEmpty()) {
            codedOutputStream.writeString(3, getUserName());
        }
        if (!this.f20971h.isEmpty()) {
            codedOutputStream.writeString(4, getDeviceOsUuid());
        }
        if (!this.f20972i.isEmpty()) {
            codedOutputStream.writeString(5, getCode());
        }
        if (this.f20973j != null) {
            codedOutputStream.writeMessage(6, getDevice());
        }
        if (this.f20974k != null) {
            codedOutputStream.writeMessage(7, getBirthdate());
        }
        boolean z = this.f20975l;
        if (z) {
            codedOutputStream.writeBool(8, z);
        }
        boolean z2 = this.f20976m;
        if (z2) {
            codedOutputStream.writeBool(9, z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19369b(String str) {
        if (str != null) {
            this.f20969f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19371c(String str) {
        if (str != null) {
            this.f20968e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19373d(String str) {
        if (str != null) {
            this.f20970g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19366a(String str) {
        if (str != null) {
            this.f20972i = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19362a(Timestamp timestamp) {
        if (timestamp != null) {
            this.f20974k = timestamp;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19367a(boolean z) {
        this.f20975l = z;
    }
}
